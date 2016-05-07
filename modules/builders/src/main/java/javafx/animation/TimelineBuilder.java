/*
 * Copyright (c) 2011, 2014, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package javafx.animation;

/**
Builder class for javafx.animation.Timeline
@see javafx.animation.Timeline
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public final class TimelineBuilder extends javafx.animation.AnimationBuilder<javafx.animation.TimelineBuilder> implements javafx.util.Builder<javafx.animation.Timeline> {
    protected TimelineBuilder() {
    }

    /** Creates a new instance of TimelineBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.animation.TimelineBuilder create() {
        return new javafx.animation.TimelineBuilder();
    }

    private boolean __set;
    public void applyTo(javafx.animation.Timeline x) {
        super.applyTo(x);
        if (__set) x.getKeyFrames().addAll(this.keyFrames);
    }

    private java.util.Collection<? extends javafx.animation.KeyFrame> keyFrames;
    /**
    Add the given items to the List of items in the {@link javafx.animation.Timeline#getKeyFrames() keyFrames} property for the instance constructed by this builder.
    */
    public javafx.animation.TimelineBuilder keyFrames(java.util.Collection<? extends javafx.animation.KeyFrame> x) {
        this.keyFrames = x;
        __set = true;
        return this;
    }

    /**
    Add the given items to the List of items in the {@link javafx.animation.Timeline#getKeyFrames() keyFrames} property for the instance constructed by this builder.
    */
    public javafx.animation.TimelineBuilder keyFrames(javafx.animation.KeyFrame... x) {
        return keyFrames(java.util.Arrays.asList(x));
    }

    private double targetFramerate;
    /**
    Set the value of the {@link javafx.animation.Timeline#getTargetFramerate() targetFramerate} property for the instance constructed by this builder.
    */
    public javafx.animation.TimelineBuilder targetFramerate(double x) {
        this.targetFramerate = x;
        return this;
    }

    /**
    Make an instance of {@link javafx.animation.Timeline} based on the properties set on this builder.
    */
    public javafx.animation.Timeline build() {
        javafx.animation.Timeline x = new javafx.animation.Timeline(this.targetFramerate);
        applyTo(x);
        return x;
    }
}
