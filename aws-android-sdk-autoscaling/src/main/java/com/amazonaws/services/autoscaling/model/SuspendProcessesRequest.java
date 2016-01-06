/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#suspendProcesses(SuspendProcessesRequest) SuspendProcesses operation}.
 * <p>
 * Suspends the specified Auto Scaling processes for the specified Auto
 * Scaling group. To suspend specific processes, use the
 * <code>ScalingProcesses</code> parameter. To suspend all processes,
 * omit the <code>ScalingProcesses</code> parameter.
 * </p>
 * <p>
 * Note that if you suspend either the <code>Launch</code> or
 * <code>Terminate</code> process types, it can prevent other process
 * types from functioning properly.
 * </p>
 * <p>
 * To resume processes that have been suspended, use ResumeProcesses.
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SuspendResume.html"> Suspend and Resume Auto Scaling Processes </a>
 * in the <i>Auto Scaling Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#suspendProcesses(SuspendProcessesRequest)
 */
public class SuspendProcessesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * One or more of the following processes: <ul>
     * <li><p><code>Launch</code></li> <li><p><code>Terminate</code></li>
     * <li><p><code>HealthCheck</code></li>
     * <li><p><code>ReplaceUnhealthy</code></li>
     * <li><p><code>AZRebalance</code></li>
     * <li><p><code>AlarmNotification</code></li>
     * <li><p><code>ScheduledActions</code></li>
     * <li><p><code>AddToLoadBalancer</code></li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> scalingProcesses;

    /**
     * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SuspendProcessesRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * One or more of the following processes: <ul>
     * <li><p><code>Launch</code></li> <li><p><code>Terminate</code></li>
     * <li><p><code>HealthCheck</code></li>
     * <li><p><code>ReplaceUnhealthy</code></li>
     * <li><p><code>AZRebalance</code></li>
     * <li><p><code>AlarmNotification</code></li>
     * <li><p><code>ScheduledActions</code></li>
     * <li><p><code>AddToLoadBalancer</code></li> </ul>
     *
     * @return One or more of the following processes: <ul>
     *         <li><p><code>Launch</code></li> <li><p><code>Terminate</code></li>
     *         <li><p><code>HealthCheck</code></li>
     *         <li><p><code>ReplaceUnhealthy</code></li>
     *         <li><p><code>AZRebalance</code></li>
     *         <li><p><code>AlarmNotification</code></li>
     *         <li><p><code>ScheduledActions</code></li>
     *         <li><p><code>AddToLoadBalancer</code></li> </ul>
     */
    public java.util.List<String> getScalingProcesses() {
        if (scalingProcesses == null) {
              scalingProcesses = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              scalingProcesses.setAutoConstruct(true);
        }
        return scalingProcesses;
    }
    
    /**
     * One or more of the following processes: <ul>
     * <li><p><code>Launch</code></li> <li><p><code>Terminate</code></li>
     * <li><p><code>HealthCheck</code></li>
     * <li><p><code>ReplaceUnhealthy</code></li>
     * <li><p><code>AZRebalance</code></li>
     * <li><p><code>AlarmNotification</code></li>
     * <li><p><code>ScheduledActions</code></li>
     * <li><p><code>AddToLoadBalancer</code></li> </ul>
     *
     * @param scalingProcesses One or more of the following processes: <ul>
     *         <li><p><code>Launch</code></li> <li><p><code>Terminate</code></li>
     *         <li><p><code>HealthCheck</code></li>
     *         <li><p><code>ReplaceUnhealthy</code></li>
     *         <li><p><code>AZRebalance</code></li>
     *         <li><p><code>AlarmNotification</code></li>
     *         <li><p><code>ScheduledActions</code></li>
     *         <li><p><code>AddToLoadBalancer</code></li> </ul>
     */
    public void setScalingProcesses(java.util.Collection<String> scalingProcesses) {
        if (scalingProcesses == null) {
            this.scalingProcesses = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> scalingProcessesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(scalingProcesses.size());
        scalingProcessesCopy.addAll(scalingProcesses);
        this.scalingProcesses = scalingProcessesCopy;
    }
    
    /**
     * One or more of the following processes: <ul>
     * <li><p><code>Launch</code></li> <li><p><code>Terminate</code></li>
     * <li><p><code>HealthCheck</code></li>
     * <li><p><code>ReplaceUnhealthy</code></li>
     * <li><p><code>AZRebalance</code></li>
     * <li><p><code>AlarmNotification</code></li>
     * <li><p><code>ScheduledActions</code></li>
     * <li><p><code>AddToLoadBalancer</code></li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scalingProcesses One or more of the following processes: <ul>
     *         <li><p><code>Launch</code></li> <li><p><code>Terminate</code></li>
     *         <li><p><code>HealthCheck</code></li>
     *         <li><p><code>ReplaceUnhealthy</code></li>
     *         <li><p><code>AZRebalance</code></li>
     *         <li><p><code>AlarmNotification</code></li>
     *         <li><p><code>ScheduledActions</code></li>
     *         <li><p><code>AddToLoadBalancer</code></li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SuspendProcessesRequest withScalingProcesses(String... scalingProcesses) {
        if (getScalingProcesses() == null) setScalingProcesses(new java.util.ArrayList<String>(scalingProcesses.length));
        for (String value : scalingProcesses) {
            getScalingProcesses().add(value);
        }
        return this;
    }
    
    /**
     * One or more of the following processes: <ul>
     * <li><p><code>Launch</code></li> <li><p><code>Terminate</code></li>
     * <li><p><code>HealthCheck</code></li>
     * <li><p><code>ReplaceUnhealthy</code></li>
     * <li><p><code>AZRebalance</code></li>
     * <li><p><code>AlarmNotification</code></li>
     * <li><p><code>ScheduledActions</code></li>
     * <li><p><code>AddToLoadBalancer</code></li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scalingProcesses One or more of the following processes: <ul>
     *         <li><p><code>Launch</code></li> <li><p><code>Terminate</code></li>
     *         <li><p><code>HealthCheck</code></li>
     *         <li><p><code>ReplaceUnhealthy</code></li>
     *         <li><p><code>AZRebalance</code></li>
     *         <li><p><code>AlarmNotification</code></li>
     *         <li><p><code>ScheduledActions</code></li>
     *         <li><p><code>AddToLoadBalancer</code></li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SuspendProcessesRequest withScalingProcesses(java.util.Collection<String> scalingProcesses) {
        if (scalingProcesses == null) {
            this.scalingProcesses = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> scalingProcessesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(scalingProcesses.size());
            scalingProcessesCopy.addAll(scalingProcesses);
            this.scalingProcesses = scalingProcessesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getScalingProcesses() != null) sb.append("ScalingProcesses: " + getScalingProcesses() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getScalingProcesses() == null) ? 0 : getScalingProcesses().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SuspendProcessesRequest == false) return false;
        SuspendProcessesRequest other = (SuspendProcessesRequest)obj;
        
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getScalingProcesses() == null ^ this.getScalingProcesses() == null) return false;
        if (other.getScalingProcesses() != null && other.getScalingProcesses().equals(this.getScalingProcesses()) == false) return false; 
        return true;
    }
    
}
    