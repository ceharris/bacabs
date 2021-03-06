/*
 * File created on Mar 20, 2015 
 *
 * Copyright (c) 2014 Virginia Polytechnic Institute and State University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.nerdwin15.bacabs;


/**
 * Describes a Jira issue.
 *
 * @author Christopher M. Dunavant
 */
public interface JiraIssue {

  /**
   * Get the summary of the issue
   * @return summary
   */
  public String getSummary();
  
  /**
   * Get the description of the issue
   * @return description
   */
  public String getDescription();

  /**
   * Get the statusId of the issue
   * @return statusId
   */
  public Integer getStatusId();
  
  /**
   * Get the statusName of the issue
   * @return statusName
   */
  public String getStatusName();

  /**
   * Get the number of tasks for the issue
   * @return numTasks
   */
  public Integer getNumTasks();

  /**
   * Get progress percentage for the issue
   * @return progressPercentage
   */
  public Integer getProgressPercentage();
  
  /**
   * Get the acceptanceTaskStatusId of the issue
   * @return acceptanceTaskStatusId
   */
  public Integer getAcceptanceTaskStatusId();

  /**
   * Get the acceptanceTaskStatusName of the issue
   * @return acceptanceTaskStatusName
   */
  public String getAcceptanceTaskStatusName();
}
