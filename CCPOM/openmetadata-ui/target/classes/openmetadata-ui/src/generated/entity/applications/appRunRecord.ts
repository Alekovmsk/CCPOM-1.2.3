/* eslint-disable @typescript-eslint/no-explicit-any */
/*
 *  Copyright 2021 Collate
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

 /**
 * App Run Record.
 */
export interface AppRunRecord {
    /**
     * Unique identifier of this application for which the job is ran.
     */
    appId?: string;
    /**
     * End time of the job status.
     */
    endTime?: number;
    /**
     * Execution time of the job status.
     */
    executionTime?: number;
    /**
     * Failure Context for the Application.
     */
    failureContext?: { [key: string]: any };
    /**
     * This schema defines the type of application Run.
     */
    runType?:      RunType;
    scheduleInfo?: any[] | boolean | AppScheduleClass | number | number | null | string;
    /**
     * Start of the job status.
     */
    startTime?: number;
    /**
     * Status for the Job.
     */
    status?: Status;
    /**
     * Success Context for the Application.
     */
    successContext?: { [key: string]: any };
    /**
     * Update time of the job status.
     */
    timestamp?: number;
}

/**
 * This schema defines the type of application Run.
 */
export enum RunType {
    OnDemand = "OnDemand",
    Scheduled = "Scheduled",
}

export interface AppScheduleClass {
    /**
     * Cron Expression in case of Custom scheduled Trigger
     */
    cronExpression?: string;
    scheduleType:    ScheduleTimeline;
}

export enum ScheduleTimeline {
    Custom = "Custom",
    Daily = " Daily",
    Hourly = "Hourly",
    Monthly = "Monthly",
    Weekly = "Weekly",
}

/**
 * Status for the Job.
 */
export enum Status {
    Active = "active",
    ActiveError = "activeError",
    Completed = "completed",
    Failed = "failed",
    Running = "running",
    Started = "started",
    Stopped = "stopped",
    Success = "success",
}
