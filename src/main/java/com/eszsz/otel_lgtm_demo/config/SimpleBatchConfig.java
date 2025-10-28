package com.eszsz.otel_lgtm_demo.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import java.time.LocalDateTime;

@Configuration
@EnableBatchProcessing
public class SimpleBatchConfig {

    @Bean
    public Job simpleJob(JobRepository jobRepository, Step step) {
        return new JobBuilder("simpleJob", jobRepository)
            .start(step)
            .build();
    }

    @Bean
    public Step step(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("simpleStep", jobRepository)
            .tasklet((contribution, chunkContext) -> {
                System.out.println("Executing batch job at " + LocalDateTime.now());
                return RepeatStatus.FINISHED;
            }, transactionManager)
            .build();
    }
}
