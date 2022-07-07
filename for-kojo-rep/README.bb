* 2022.06.08
** kojo doesn't compile with Java 15. So switch to Java 8 or 11:
export PATH=.:/Users/ben/bin:/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin
* 2022.02.02

Recent commits
19149766 origin/master Merge branch 'master' of https://github.com/bulent2k2/kojo
87e88a3c Tweaks to turkish documentation
8e4f9336 Animation transitions should be at the final state when they finish.
b3c8df81 Bump up license year.
702bdba0 Bump up install4j to 9.0.5, and bundled JRE to 11.0.13-xx.
cdb8339a Tweaks.
01a3853e Tweaks.
0d0954f8 Bump up installer version number to 2.9.16
7c859c49 Bump up Scala version to 2.13.8
2695a282 Refinements.

Staged changes (28)
modified   build.sbt
@@ -1,4 +1,4 @@
-lazy val scalaVer = "2.13.6"
+lazy val scalaVer = "2.13.8"
 name := "Kojo"
 version := "2.9"
 scalaVersion := scalaVer
modified   installer.i4j/kojo.install4j
@@ -1,12 +1,12 @@
 <?xml version="1.0" encoding="UTF-8"?>
-<install4j version="8.0.6" transformSequenceNumber="8">
+<install4j version="9.0.5" transformSequenceNumber="9">
   <directoryPresets config="/home/lalit/work/kojo/installer/icons" />
-  <application name="Kojo Learning Environment" applicationId="0071-0523-9450-8404" mediaDir="/home/lalit/kojo_installers/install4j" mediaFilePattern="${compiler:sys.shortName}_${compiler:sys.platform}_${compiler:sys.version}${compiler:sys.withJre}" pack200Compression="true" shortName="Kojo" publisher="Kogics Foundation" publisherWeb="www.kogics.net/kojo" version="2.9.15" macVolumeId="41bac862080108f9" javaMinVersion="1.8" javaMaxVersion="11" jdkMode="jdk" jdkName="JDK 1.8">
+  <application name="Kojo Learning Environment" applicationId="0071-0523-9450-8404" mediaDir="/home/lalit/kojo_installers/install4j" mediaFilePattern="${compiler:sys.shortName}_${compiler:sys.platform}_${compiler:sys.version}${compiler:sys.withJre}" pack200Compression="true" shortName="Kojo" publisher="Kogics Foundation" publisherWeb="www.kogics.net/kojo" version="2.9.16" macVolumeId="41bac862080108f9" javaMinVersion="1.8" javaMaxVersion="11" jdkMode="jdk" jdkName="JDK 1.8">
     <searchSequence>
       <registry />
       <envVar name="JAVA_HOME" />
     </searchSequence>
-    <jreBundles jdkProviderId="JBR" release="11.0.7-b765.65">
+    <jreBundles jdkProviderId="JBR" release="11/11.0.13-b1751.21">
       <modules>
         <module name="java.base" />
         <module name="java.compiler" />
@@ -33,7 +33,7 @@
       </modules>
     </jreBundles>
   </application>
-  <files>
+  <files preserveSymlinks="false">
     <mountPoints>
       <mountPoint id="58" />
     </mountPoints>
@@ -410,11 +410,19 @@ return console.askYesNo(message, true);
           <group id="42" beanClass="com.install4j.runtime.beans.groups.VerticalFormComponentGroup" useExternalParametrization="true" externalParametrizationName="Customize banner image" externalParametrizationMode="include">
             <serializedBean>
               <property name="backgroundColor">
-                <object class="java.awt.Color">
-                  <int>255</int>
-                  <int>255</int>
-                  <int>255</int>
-                  <int>255</int>
+                <object class="com.install4j.runtime.beans.LightOrDarkColor">
+                  <object class="java.awt.Color">
+                    <int>255</int>
+                    <int>255</int>
+                    <int>255</int>
+                    <int>255</int>
+                  </object>
+                  <object class="java.awt.Color">
+                    <int>49</int>
+                    <int>52</int>
+                    <int>53</int>
+                    <int>255</int>
+                  </object>
                 </object>
               </property>
               <property name="borderSides">
@@ -423,11 +431,19 @@ return console.askYesNo(message, true);
                 </object>
               </property>
               <property name="imageEdgeBackgroundColor">
-                <object class="java.awt.Color">
-                  <int>25</int>
-                  <int>143</int>
-                  <int>220</int>
-                  <int>255</int>
+                <object class="com.install4j.runtime.beans.LightOrDarkColor">
+                  <object class="java.awt.Color">
+                    <int>25</int>
+                    <int>143</int>
+                    <int>220</int>
+                    <int>255</int>
+                  </object>
+                  <object class="java.awt.Color">
+                    <int>0</int>
+                    <int>74</int>
+                    <int>151</int>
+                    <int>255</int>
+                  </object>
                 </object>
               </property>
               <property name="imageEdgeBorder" type="boolean" value="true" />
@@ -481,11 +497,19 @@ return console.askYesNo(message, true);
               <group id="49" beanClass="com.install4j.runtime.beans.groups.VerticalFormComponentGroup" useExternalParametrization="true" externalParametrizationName="Customize title bar" externalParametrizationMode="include">
                 <serializedBean>
                   <property name="backgroundColor">
-                    <object class="java.awt.Color">
-                      <int>255</int>
-                      <int>255</int>
-                      <int>255</int>
-                      <int>255</int>
+                    <object class="com.install4j.runtime.beans.LightOrDarkColor">
+                      <object class="java.awt.Color">
+                        <int>255</int>
+                        <int>255</int>
+                        <int>255</int>
+                        <int>255</int>
+                      </object>
+                      <object class="java.awt.Color">
+                        <int>49</int>
+                        <int>52</int>
+                        <int>53</int>
+                        <int>255</int>
+                      </object>
                     </object>
                   </property>
                   <property name="borderSides">
@@ -589,17 +613,17 @@ return console.askYesNo(message, true);
   </installerGui>
   <mediaSets>
     <unixInstaller name="Unix Installer" id="60">
-      <jreBundle jreBundleSource="generated" includedJre="linux-amd64-11.0.6" />
+      <jreBundle includedJre="linux-amd64-11.0.6" />
     </unixInstaller>
     <windows name="Windows" id="244" jreBitType="32">
-      <jreBundle jreBundleSource="generated" includedJre="windows-x86-1.8.0_202" />
+      <jreBundle includedJre="windows-x86-1.8.0_202" />
     </windows>
-    <macos name="macOS Single Bundle" id="508" launcherId="239">
-      <jreBundle jreBundleSource="generated" />
-    </macos>
-    <unixInstaller name="Unix Installer NoJava" id="514" />
+    <macos name="macOS Single Bundle" id="508" launcherId="239" />
+    <unixInstaller name="Unix Installer NoJava" id="514">
+      <jreBundle jreBundleSource="none" />
+    </unixInstaller>
     <windows name="Windows64" id="600">
-      <jreBundle jdkProviderId="JBR" release="11.0.6-b765.25" jreBundleSource="generated" />
+      <jreBundle jdkProviderId="JBR" release="11.0.6-b765.25" />
     </windows>
   </mediaSets>
   <buildIds>
modified   installer/jarlist.txt
@@ -17,7 +17,7 @@
 ../dist/jssc.jar
 ../dist/flatlaf-1.6.jar -> flatlaf.jar
 ../dist/libtiled.jar
-../dist/scala-reflect-2.13.6.jar -> scala-reflect.jar
+../dist/scala-reflect-2.13.8.jar -> scala-reflect.jar
 ../dist/akka-actor_2.13-2.6.16.jar -> akka-actors.jar
 ../dist/scala-swing_2.13-2.1.1.jar -> scala-swing.jar
 ../dist/scala-xml_2.13-1.2.0.jar -> scala-xml.jar
@@ -28,8 +28,8 @@
 ../dist/h2-1.3.168.jar -> h2.jar
 ../dist/scalatest_2.13-3.0.8.jar -> scalatest.jar
 ../dist/scalactic_2.13-3.0.8.jar -> scalactic.jar
-../dist/scala-library-2.13.6.jar -> scala-library.jar
-../dist/scala-compiler-2.13.6.jar -> scala-compiler.jar
+../dist/scala-library-2.13.8.jar -> scala-library.jar
+../dist/scala-compiler-2.13.8.jar -> scala-compiler.jar
 ../dist/config-1.4.0.jar -> config.jar
 ../dist/scala-java8-compat_2.13-1.0.0.jar -> scala-java8-compat.jar
 ../dist/activation-1.1.jar -> activation.jar
modified   installer/licenses/Kojo-license.txt
@@ -1,5 +1,5 @@
 
-Copyright (C) 2009-2021 Lalit Pant <pant.lalit@gmail.com> and the Kojo Dev Team.
+Copyright (C) 2009-2022 Lalit Pant <pant.lalit@gmail.com> and the Kojo Dev Team.
 Kojo is licensed under The GNU General Public License, Version 3. The full text 
 of the license is available at: http://www.gnu.org/licenses/gpl.html, and is 
 also reproduced below for quick reference.
modified   installer/licenses/Kojoi-license.txt
@@ -1,5 +1,5 @@
 
-Copyright (C) 2009-2021 Lalit Pant <pant.lalit@gmail.com> and the Kojo Dev Team. Kojo is licensed under The GNU General Public License, Version 3. The full text of the license is available at: http://www.gnu.org/licenses/gpl.html, and is also reproduced below for quick reference.
+Copyright (C) 2009-2022 Lalit Pant <pant.lalit@gmail.com> and the Kojo Dev Team. Kojo is licensed under The GNU General Public License, Version 3. The full text of the license is available at: http://www.gnu.org/licenses/gpl.html, and is also reproduced below for quick reference.
 
 Kojo makes use of third-party software. A list of this software is available in the 'Help -> About' menu item in Kojo.
 
new file   src/main/java/net/kogics/kojo/util/Easing.java
@@ -0,0 +1,586 @@
+// Source:
+// https://github.com/mattdesl/cisc226game/blob/master/SpaceGame/src/space/engine/easing/Easing.java
+// The original easing functions by Robert Penner are licensed under the BSD and MIT Licenses:
+// http://robertpenner.com/easing_terms_of_use.html
+
+package net.kogics.kojo.util;
+
+/**
+ * <p>The Easing class holds a set of general-purpose motion
+ * tweening functions by Robert Penner. This class is
+ * essentially a port from Penner's ActionScript utility,
+ * with a few added tweaks.</p>
+ * <p>Examples:<pre>
+ *    //no tween
+ *    Easing e1 = Easing.LINEAR;
+ *
+ *    //backOut tween, the overshoot is Easing.Back.DEFAULT_OVERSHOOT
+ *    Easing e2 = Easing.BACK_OUT;
+ *
+ *    //backOut tween, the overshoot is 1.85f
+ *    Easing.Back e3 = new Easing.BackOut(1.85f);
+ * </pre></p>
+ * <a href="http://www.robertpenner.com/easing/">Robert Penner's Easing Functions</a>
+ *
+ * @author Robert Penner (functions)
+ * @author davedes (java port)
+ */
+public interface Easing {
+
+    /**
+     * The basic function for easing.
+     *
+     * @param t the time (either frames or in seconds/milliseconds)
+     * @param b the beginning value
+     * @param c the value changed
+     * @param d the duration time
+     * @return the eased value
+     */
+    public float ease(float t, float b, float c, float d);
+
+    /**
+     * Simple linear tweening - no easing.
+     */
+    public static final Easing LINEAR = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            return c * t / d + b;
+        }
+    };
+
+    ///////////// QUADRATIC EASING: t^2 ///////////////////
+
+    /**
+     * Quadratic easing in - accelerating from zero velocity.
+     */
+    public static final Easing QUAD_IN = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            return c * (t /= d) * t + b;
+        }
+    };
+
+    /**
+     * Quadratic easing out - decelerating to zero velocity.
+     */
+    public static final Easing QUAD_OUT = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            return -c * (t /= d) * (t - 2) + b;
+        }
+    };
+
+    /**
+     * Quadratic easing in/out - acceleration until halfway, then deceleration
+     */
+    public static final Easing QUAD_IN_OUT = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            if ((t /= d / 2) < 1) return c / 2 * t * t + b;
+            return -c / 2 * ((--t) * (t - 2) - 1) + b;
+        }
+    };
+
+
+    ///////////// CUBIC EASING: t^3 ///////////////////////
+
+    /**
+     * Cubic easing in - accelerating from zero velocity.
+     */
+    public static final Easing CUBIC_IN = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            return c * (t /= d) * t * t + b;
+        }
+    };
+
+    /**
+     * Cubic easing out - decelerating to zero velocity.
+     */
+    public static final Easing CUBIC_OUT = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            return c * ((t = t / d - 1) * t * t + 1) + b;
+        }
+    };
+
+    /**
+     * Cubic easing in/out - acceleration until halfway, then deceleration.
+     */
+    public static final Easing CUBIC_IN_OUT = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            if ((t /= d / 2) < 1) return c / 2 * t * t * t + b;
+            return c / 2 * ((t -= 2) * t * t + 2) + b;
+        }
+    };
+
+    ///////////// QUARTIC EASING: t^4 /////////////////////
+
+    /**
+     * Quartic easing in - accelerating from zero velocity.
+     */
+    public static final Easing QUARTIC_IN = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            return c * (t /= d) * t * t * t + b;
+        }
+    };
+
+    /**
+     * Quartic easing out - decelerating to zero velocity.
+     */
+    public static final Easing QUARTIC_OUT = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            return -c * ((t = t / d - 1) * t * t * t - 1) + b;
+        }
+    };
+
+    /**
+     * Quartic easing in/out - acceleration until halfway, then deceleration.
+     */
+    public static final Easing QUARTIC_IN_OUT = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            if ((t /= d / 2) < 1) return c / 2 * t * t * t * t + b;
+            return -c / 2 * ((t -= 2) * t * t * t - 2) + b;
+        }
+    };
+
+    ///////////// QUINTIC EASING: t^5  ////////////////////
+
+    /**
+     * Quintic easing in - accelerating from zero velocity.
+     */
+    public static final Easing QUINTIC_IN = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            return c * (t /= d) * t * t * t * t + b;
+        }
+    };
+
+    /**
+     * Quintic easing out - decelerating to zero velocity.
+     */
+    public static final Easing QUINTIC_OUT = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            return c * ((t = t / d - 1) * t * t * t * t + 1) + b;
+        }
+    };
+
+    /**
+     * Quintic easing in/out - acceleration until halfway, then deceleration.
+     */
+    public static final Easing QUINTIC_IN_OUT = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            if ((t /= d / 2) < 1) return c / 2 * t * t * t * t * t + b;
+            return c / 2 * ((t -= 2) * t * t * t * t + 2) + b;
+        }
+    };
+
+
+    ///////////// SINUSOIDAL EASING: sin(t) ///////////////
+
+    /**
+     * Sinusoidal easing in - accelerating from zero velocity.
+     */
+    public static final Easing SINE_IN = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            return -c * (float) Math.cos(t / d * (Math.PI / 2)) + c + b;
+        }
+    };
+
+    /**
+     * Sinusoidal easing out - decelerating to zero velocity.
+     */
+    public static final Easing SINE_OUT = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            return c * (float) Math.sin(t / d * (Math.PI / 2)) + b;
+        }
+    };
+
+    /**
+     * Sinusoidal easing in/out - accelerating until halfway, then decelerating.
+     */
+    public static final Easing SINE_IN_OUT = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            return -c / 2 * ((float) Math.cos(Math.PI * t / d) - 1) + b;
+        }
+    };
+
+    ///////////// EXPONENTIAL EASING: 2^t /////////////////
+
+    /**
+     * Exponential easing in - accelerating from zero velocity.
+     */
+    public static final Easing EXPO_IN = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            return (t == 0) ? b : c * (float) Math.pow(2, 10 * (t / d - 1)) + b;
+        }
+    };
+
+    /**
+     * Exponential easing out - decelerating to zero velocity.
+     */
+    public static final Easing EXPO_OUT = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            return (t == d) ? b + c : c * (-(float) Math.pow(2, -10 * t / d) + 1) + b;
+        }
+    };
+
+    /**
+     * Exponential easing in/out - accelerating until halfway, then decelerating.
+     */
+    public static final Easing EXPO_IN_OUT = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            if (t == 0) return b;
+            if (t == d) return b + c;
+            if ((t /= d / 2) < 1) return c / 2 * (float) Math.pow(2, 10 * (t - 1)) + b;
+            return c / 2 * (-(float) Math.pow(2, -10 * --t) + 2) + b;
+        }
+    };
+
+
+    /////////// CIRCULAR EASING: sqrt(1-t^2) //////////////
+
+    /**
+     * Circular easing in - accelerating from zero velocity.
+     */
+    public static final Easing CIRC_IN = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            return -c * ((float) Math.sqrt(1 - (t /= d) * t) - 1) + b;
+        }
+    };
+
+    /**
+     * Circular easing out - decelerating to zero velocity.
+     */
+    public static final Easing CIRC_OUT = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            return c * (float) Math.sqrt(1 - (t = t / d - 1) * t) + b;
+        }
+    };
+
+    /**
+     * Circular easing in/out - acceleration until halfway, then deceleration.
+     */
+    public static final Easing CIRC_IN_OUT = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            if ((t /= d / 2) < 1) return -c / 2 * ((float) Math.sqrt(1 - t * t) - 1) + b;
+            return c / 2 * ((float) Math.sqrt(1 - (t -= 2) * t) + 1) + b;
+        }
+    };
+
+    /////////// ELASTIC EASING: exponentially decaying sine wave  //////////////
+
+    /**
+     * A base class for elastic easings.
+     */
+    public static abstract class Elastic implements Easing {
+        private float amplitude;
+        private float period;
+
+        /**
+         * Creates a new Elastic easing with the specified settings.
+         *
+         * @param amplitude the amplitude for the elastic function
+         * @param period    the period for the elastic function
+         */
+        public Elastic(float amplitude, float period) {
+            this.amplitude = amplitude;
+            this.period = period;
+        }
+
+        /**
+         * Creates a new Elastic easing with default settings (-1f, 0f).
+         */
+        public Elastic() {
+            this(-1f, 0f);
+        }
+
+        /**
+         * Returns the period.
+         *
+         * @return the period for this easing
+         */
+        public float getPeriod() {
+            return period;
+        }
+
+        /**
+         * Sets the period to the given value.
+         *
+         * @param period the new period
+         */
+        public void setPeriod(float period) {
+            this.period = period;
+        }
+
+        /**
+         * Returns the amplitude.
+         *
+         * @return the amplitude for this easing
+         */
+        public float getAmplitude() {
+            return amplitude;
+        }
+
+        /**
+         * Sets the amplitude to the given value.
+         *
+         * @param amplitude the new amplitude
+         */
+        public void setAmplitude(float amplitude) {
+            this.amplitude = amplitude;
+        }
+    }
+
+    /**
+     * An EasingIn instance using the default values.
+     */
+    public static final Easing.Elastic ELASTIC_IN = new Easing.ElasticIn();
+
+    /**
+     * An Elastic easing used for ElasticIn functions.
+     */
+    public static class ElasticIn extends Elastic {
+        public ElasticIn(float amplitude, float period) {
+            super(amplitude, period);
+        }
+
+        public ElasticIn() {
+            super();
+        }
+
+        public float ease(float t, float b, float c, float d) {
+            float a = getAmplitude();
+            float p = getPeriod();
+            if (t == 0) return b;
+            if ((t /= d) == 1) return b + c;
+            if (p == 0) p = d * .3f;
+            float s = 0;
+            if (a < Math.abs(c)) {
+                a = c;
+                s = p / 4;
+            } else s = p / (float) (2 * Math.PI) * (float) Math.asin(c / a);
+            return -(a * (float) Math.pow(2, 10 * (t -= 1)) * (float) Math.sin((t * d - s) * (2 * Math.PI) / p)) + b;
+        }
+    }
+
+    /**
+     * An ElasticOut instance using the default values.
+     */
+    public static final Easing.Elastic ELASTIC_OUT = new Easing.ElasticOut();
+
+    /**
+     * An Elastic easing used for ElasticOut functions.
+     */
+    public static class ElasticOut extends Elastic {
+        public ElasticOut(float amplitude, float period) {
+            super(amplitude, period);
+        }
+
+        public ElasticOut() {
+            super();
+        }
+
+        public float ease(float t, float b, float c, float d) {
+            float a = getAmplitude();
+            float p = getPeriod();
+            if (t == 0) return b;
+            if ((t /= d) == 1) return b + c;
+            if (p == 0) p = d * .3f;
+            float s = 0;
+            if (a < Math.abs(c)) {
+                a = c;
+                s = p / 4;
+            } else s = p / (float) (2 * Math.PI) * (float) Math.asin(c / a);
+            return a * (float) Math.pow(2, -10 * t) * (float) Math.sin((t * d - s) * (2 * Math.PI) / p) + c + b;
+        }
+    }
+
+    /**
+     * An ElasticInOut instance using the default values.
+     */
+    public static final Easing.Elastic ELASTIC_IN_OUT = new Easing.ElasticInOut();
+
+    /**
+     * An Elastic easing used for ElasticInOut functions.
+     */
+    public static class ElasticInOut extends Elastic {
+        public ElasticInOut(float amplitude, float period) {
+            super(amplitude, period);
+        }
+
+        public ElasticInOut() {
+            super();
+        }
+
+        public float ease(float t, float b, float c, float d) {
+            float a = getAmplitude();
+            float p = getPeriod();
+            if (t == 0) return b;
+            if ((t /= d / 2) == 2) return b + c;
+            if (p == 0) p = d * (.3f * 1.5f);
+            float s = 0;
+            if (a < Math.abs(c)) {
+                a = c;
+                s = p / 4f;
+            } else s = p / (float) (2 * Math.PI) * (float) Math.asin(c / a);
+            if (t < 1)
+                return -.5f * (a * (float) Math.pow(2, 10 * (t -= 1)) * (float) Math.sin((t * d - s) * (2 * Math.PI) / p)) + b;
+            return a * (float) Math.pow(2, -10 * (t -= 1)) * (float) Math.sin((t * d - s) * (2 * Math.PI) / p) * .5f + c + b;
+        }
+    }
+
+    /////////// BACK EASING: overshooting cubic easing: (s+1)*t^3 - s*t^2  //////////////
+
+    /**
+     * A base class for Back easings.
+     */
+    public static abstract class Back implements Easing {
+        /**
+         * The default overshoot is 10% (1.70158).
+         */
+        public static final float DEFAULT_OVERSHOOT = 1.70158f;
+
+        private float overshoot;
+
+        /**
+         * Creates a new Back instance with the default overshoot (1.70158).
+         */
+        public Back() {
+            this(DEFAULT_OVERSHOOT);
+        }
+
+        /**
+         * Creates a new Back instance with the specified overshoot.
+         *
+         * @param overshoot the amount to overshoot by -- higher number
+         *                  means more overshoot and an overshoot of 0 results in
+         *                  cubic easing with no overshoot
+         */
+        public Back(float overshoot) {
+            this.overshoot = overshoot;
+        }
+
+        /**
+         * Sets the overshoot to the given value.
+         *
+         * @param overshoot the new overshoot
+         */
+        public void setOvershoot(float overshoot) {
+            this.overshoot = overshoot;
+        }
+
+        /**
+         * Returns the overshoot for this easing.
+         *
+         * @return this easing's overshoot
+         */
+        public float getOvershoot() {
+            return overshoot;
+        }
+    }
+
+    /**
+     * An instance of BackIn using the default overshoot.
+     */
+    public static final Easing.Back BACK_IN = new Easing.BackIn();
+
+    /**
+     * Back easing in - backtracking slightly, then reversing direction and moving to target.
+     */
+    public static class BackIn extends Back {
+        public BackIn() {
+            super();
+        }
+
+        public BackIn(float overshoot) {
+            super(overshoot);
+        }
+
+        public float ease(float t, float b, float c, float d) {
+            float s = getOvershoot();
+            return c * (t /= d) * t * ((s + 1) * t - s) + b;
+        }
+    }
+
+    ;
+
+    /**
+     * An instance of BackOut using the default overshoot.
+     */
+    public static final Easing.Back BACK_OUT = new Easing.BackOut();
+
+    /**
+     * Back easing out - moving towards target, overshooting it slightly, then reversing and coming back to target.
+     */
+    public static class BackOut extends Back {
+        public BackOut() {
+            super();
+        }
+
+        public BackOut(float overshoot) {
+            super(overshoot);
+        }
+
+        public float ease(float t, float b, float c, float d) {
+            float s = getOvershoot();
+            return c * ((t = t / d - 1) * t * ((s + 1) * t + s) + 1) + b;
+        }
+    }
+
+    /**
+     * An instance of BackInOut using the default overshoot.
+     */
+    public static final Easing.Back BACK_IN_OUT = new Easing.BackInOut();
+
+    /**
+     * Back easing in/out - backtracking slightly, then reversing direction and moving to target,
+     * then overshooting target, reversing, and finally coming back to target.
+     */
+    public static class BackInOut extends Back {
+        public BackInOut() {
+            super();
+        }
+
+        public BackInOut(float overshoot) {
+            super(overshoot);
+        }
+
+        public float ease(float t, float b, float c, float d) {
+            float s = getOvershoot();
+            if ((t /= d / 2) < 1) return c / 2 * (t * t * (((s *= (1.525)) + 1) * t - s)) + b;
+            return c / 2 * ((t -= 2) * t * (((s *= (1.525)) + 1) * t + s) + 2) + b;
+        }
+    }
+
+    /////////// BOUNCE EASING: exponentially decaying parabolic bounce  //////////////
+
+    /**
+     * Bounce easing in.
+     */
+    public static final Easing BOUNCE_IN = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            return c - Easing.BOUNCE_OUT.ease(d - t, 0, c, d) + b;
+        }
+    };
+
+    /**
+     * Bounce easing out.
+     */
+    public static final Easing BOUNCE_OUT = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            if ((t /= d) < (1 / 2.75f)) {
+                return c * (7.5625f * t * t) + b;
+            } else if (t < (2 / 2.75f)) {
+                return c * (7.5625f * (t -= (1.5f / 2.75f)) * t + .75f) + b;
+            } else if (t < (2.5f / 2.75f)) {
+                return c * (7.5625f * (t -= (2.25f / 2.75f)) * t + .9375f) + b;
+            } else {
+                return c * (7.5625f * (t -= (2.625f / 2.75f)) * t + .984375f) + b;
+            }
+        }
+    };
+
+    /**
+     * Bounce easing in/out.
+     */
+    public static final Easing BOUNCE_IN_OUT = new Easing() {
+        public float ease(float t, float b, float c, float d) {
+            if (t < d / 2) return Easing.BOUNCE_IN.ease(t * 2, 0, c, d) * .5f + b;
+            return Easing.BOUNCE_OUT.ease(t * 2 - d, 0, c, d) * .5f + c * .5f + b;
+        }
+    };
+}
\ No newline at end of file
modified   src/main/resources/net/kogics/kojo/lite/Bundle.properties
@@ -61,6 +61,7 @@ S_AnimationsGames=Animations and Games
 S_TangramSkier=Tangram Skier
 S_LunarLander=Lunar Lander
 S_PulsatingLamp=Pulsating Lamp
+S_PulsatingLamp2=Pulsating Lamp 2
 S_CrazySquare=Crazy Square
 S_Hunted=Hunted
 S_Pong=Pong
modified   src/main/resources/samples/collidium.kojo
@@ -62,9 +62,9 @@ def line(ps: ArrayBuffer[Point], c: Color) = Picture {
     sq()
 }
 val slingPts = ArrayBuffer.empty[Point]
-var sling = Picture.hline(1)
-var paddle = Picture.hline(1)
-var tempPaddle = paddle
+var sling: Picture = Picture.hline(1)
+var paddle: Picture = Picture.hline(1)
+var tempPaddle: Picture = paddle
 drawAndHide(paddle)
 
 ball.onMousePress { (x, y) =>
new file   src/main/resources/samples/lamp-animation2.kojo
@@ -0,0 +1,42 @@
+// Pulsating lamp/diya - using turtle pictures and transitions
+
+cleari()
+setBackground(cm.darkSlateBlue)
+
+val flame = Picture {
+    setFillColor(cm.linearGradient(0, 0, cm.red, 0, 130, cm.yellow))
+    setPenColor(cm.yellow)
+    setPenThickness(3)
+    left(45)
+    right(90, 100)
+    right(90)
+    right(90, 100)
+}
+
+val diya = Picture {
+    setFillColor(cm.linearGradient(0, 10, cm.red, 0, -25, cm.brown))
+    setPenThickness(2)
+    setPenColor(cm.black)
+    left(120)
+    right(60, 100)
+    right(180)
+    right(30)
+    left(120, 115)
+    right(180)
+    right(30)
+    right(60, 100)
+}
+
+draw(diya)
+
+def scaleProp(s: Seq[Double]) = s(0)
+
+def makeflame(s: Seq[Double]) = {
+    scale(scaleProp(s)) -> flame
+}
+
+val anim = Transition(1, Seq(1), Seq(0.8), easing.QuadInOut, makeflame, true)
+
+val anim2 = animSeq(anim, anim.reversed).repeatedForever
+
+run(anim2)
\ No newline at end of file
new file   src/main/scala/net/kogics/kojo/animation/package.scala
@@ -0,0 +1,299 @@
+/*
+ * Copyright (C) 2021 Lalit Pant <pant.lalit@gmail.com>
+ *
+ * The contents of this file are subject to the GNU General Public License
+ * Version 3 (the "License"); you may not use this file
+ * except in compliance with the License. You may obtain a copy of
+ * the License at http://www.gnu.org/copyleft/gpl.html
+ *
+ * Software distributed under the License is distributed on an "AS
+ * IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or
+ * implied. See the License for the specific language governing
+ * rights and limitations under the License.
+ *
+ */
+package net.kogics.kojo
+
+import net.kogics.kojo.core.{Picture, SCanvas}
+import net.kogics.kojo.kmath.KEasing
+
+package object animation {
+  trait Animation {
+    def run()(implicit canvas: SCanvas): Unit = run(() => {})
+
+    def run(onDone: () => Unit)(implicit canvas: SCanvas): Unit
+
+    def reversed: Animation
+
+    def repeated(count: Int) = RepeatedAnimation(this, count)
+
+    def repeatedForever = repeated(Int.MaxValue)
+  }
+
+  // frames contain a seq of time => state
+  case class KeyFrames(frames: Seq[(Double, Seq[Double])])
+
+  object Animation {
+    def apply(
+               duration: Double,
+               initState: Seq[Double],
+               finalState: Seq[Double],
+               easer: KEasing,
+               picMaker: Seq[Double] => Picture,
+               hideOnDone: Boolean
+             ): Animation = Transition(duration, initState, finalState, easer, picMaker, hideOnDone)
+
+    def apply(
+               duration: Double,
+               keyFrames: KeyFrames,
+               easers: Seq[KEasing],
+               picMaker: Seq[Double] => Picture,
+               hideOnDone: Boolean
+             ): Animation = Timeline(duration, keyFrames, easers, picMaker, hideOnDone)
+  }
+
+  private[animation] object AnimationUtils {
+    def transitions(
+                     duration: Double,
+                     keyFrames: KeyFrames,
+                     easers: Seq[KEasing],
+                     picMaker: Seq[Double] => Picture,
+                     hideOnDone: Boolean
+                   ): Iterator[Transition] = {
+      require(
+        keyFrames.frames.length - 1 == easers.length,
+        s"Incorrect number of easings for keyframes - required = ${keyFrames.frames.length - 1}, actual = ${easers.length}"
+      )
+      keyFrames.frames.sliding(2).zip(easers).map { case (Seq(as1, as2), easer) =>
+        val tduration = (as2._1 - as1._1) / 100 * duration
+        val initState = as1._2
+        val finalState = as2._2
+        Transition(tduration, initState, finalState, easer, picMaker, hideOnDone)
+      }
+    }
+
+    def checkKeyFrames(keyFrames: KeyFrames): Unit = {
+      val frames = keyFrames.frames
+      require(frames.length > 1, "KeyFrames should have at least two frames")
+      require(frames.head._1 == 0, "KeyFrames should start at 0%")
+      require(frames.last._1 == 100, "KeyFrames should end at 100%")
+      frames.sliding(2).foreach { case (Seq(as1, as2)) =>
+        require(as2._1 > as1._1, "Keyframe start times should be in increasing order")
+      }
+    }
+  }
+
+  case class Transition(
+                         duration: Double, // in seconds
+                         initState: Seq[Double],
+                         finalState: Seq[Double],
+                         easer: KEasing,
+                         picMaker: Seq[Double] => Picture,
+                         hideOnDone: Boolean
+                       ) extends Animation {
+
+    val stateSize = initState.size
+    val durationMillis = duration * 1000
+
+    private def nextState(s: Seq[Double], elapsedTimeMillis: Double): Seq[Double] = {
+      if (elapsedTimeMillis > durationMillis) {
+        s
+      }
+      else {
+        for (idx <- 0 to stateSize - 1) yield {
+          easer.ease(initState(idx), finalState(idx), elapsedTimeMillis, durationMillis)
+        }
+      }
+    }
+
+    def run(onDone: () => Unit)(implicit canvas: SCanvas): Unit = {
+      import edu.umd.cs.piccolo.activities.PActivity
+
+      import java.util.concurrent.Future
+
+      val startMillis = System.currentTimeMillis
+      val initPic: Picture = picture.rect2(0, 0)
+      lazy val anim: Future[PActivity] =
+        canvas.animateWithState((initPic, initState, false, 0)) { case (pic, s, stop, stopcnt) =>
+          if (stop) {
+            if (stopcnt == 0) {
+              pic.erase()
+              val pic2 = picMaker(finalState)
+              pic2.draw()
+              (pic2, finalState, stop, stopcnt + 1)
+            }
+            else {
+              if (stopcnt == 2) {
+                canvas.stopAnimationActivity(anim)
+                if (hideOnDone) {
+                  pic.erase()
+                }
+              }
+              (pic, s, stop, stopcnt + 1)
+            }
+          }
+          else {
+            pic.erase()
+            val pic2 = picMaker(s)
+            pic2.draw()
+            val ns = nextState(s, (System.currentTimeMillis - startMillis).toDouble)
+            if (ns == s) {
+              onDone()
+              (pic2, ns, true, 0)
+            }
+            else {
+              (pic2, ns, stop, stopcnt)
+            }
+          }
+        }
+      anim
+    }
+
+    def reversed: Animation = this.copy(initState = this.finalState, finalState = this.initState)
+  }
+
+  case class Timeline(
+                       duration: Double,
+                       keyFrames: KeyFrames,
+                       easers: Seq[KEasing],
+                       picMaker: Seq[Double] => Picture,
+                       hideOnDone: Boolean
+                     ) extends Animation {
+    AnimationUtils.checkKeyFrames(keyFrames)
+
+    private def transitions = AnimationUtils.transitions(duration, keyFrames, easers, picMaker, true)
+
+    lazy val anims = animSeq(transitions.toSeq)
+
+    def run(onDone: () => Unit)(implicit canvas: SCanvas): Unit = {
+      anims.run { () =>
+        onDone()
+        if (!hideOnDone) {
+          val finalPic = picMaker(keyFrames.frames.last._2)
+          finalPic.draw()
+        }
+      }
+    }
+
+    def reversed: Animation = TimelineReversed(duration, keyFrames, easers, picMaker, hideOnDone)
+  }
+
+  case class TimelineReversed(
+                               duration: Double,
+                               keyFrames: KeyFrames,
+                               easers: Seq[KEasing],
+                               picMaker: Seq[Double] => Picture,
+                               hideOnDone: Boolean
+                             ) extends Animation {
+    AnimationUtils.checkKeyFrames(keyFrames)
+
+    private def transitions = AnimationUtils.transitions(duration, keyFrames, easers, picMaker, true)
+
+    lazy val anims = animSeq(transitions.toSeq).reversed
+
+    def run(onDone: () => Unit)(implicit canvas: SCanvas): Unit = {
+      anims.run { () =>
+        onDone()
+        if (!hideOnDone) {
+          val finalPic = picMaker(keyFrames.frames.head._2)
+          finalPic.draw()
+        }
+      }
+    }
+
+    def reversed: Animation = Timeline(duration, keyFrames, easers, picMaker, hideOnDone)
+  }
+
+  case class RepeatedAnimation(a: Animation, count: Int) extends Animation {
+    def run(onDone: () => Unit)(implicit canvas: SCanvas): Unit = {
+      var doneCount = 0
+
+      def triggerDone(): Unit = {
+        doneCount += 1
+        if (doneCount == count) {
+          onDone()
+        }
+        else {
+          runAnim()
+        }
+      }
+
+      def runAnim(): Unit = {
+        a.run(triggerDone)
+      }
+
+      if (count > 0) {
+        runAnim()
+      }
+    }
+
+    def reversed: Animation = RepeatedAnimationReversed(a, count)
+  }
+
+  case class RepeatedAnimationReversed(a: Animation, count: Int) extends Animation {
+    lazy val reversedA = a.reversed
+
+    def run(onDone: () => Unit)(implicit canvas: SCanvas): Unit = {
+      var doneCount = 0
+
+      def triggerDone(): Unit = {
+        doneCount += 1
+        if (doneCount == count) {
+          onDone()
+        }
+        else {
+          runAnim()
+        }
+      }
+
+      def runAnim(): Unit = {
+        reversedA.run(triggerDone)
+      }
+
+      runAnim()
+    }
+
+    def reversed: Animation = RepeatedAnimation(a, count)
+  }
+
+
+  case class SeqAnimation(a1: Animation, a2: Animation) extends Animation {
+    def run(onDone: () => Unit)(implicit canvas: SCanvas): Unit = {
+      a1.run(() => a2.run(onDone))
+    }
+
+    def reversed: Animation = SeqAnimation(a2.reversed, a1.reversed)
+  }
+
+  case class ParAnimation(a1: Animation, a2: Animation) extends Animation {
+    def run(onDone: () => Unit)(implicit canvas: SCanvas): Unit = {
+      var doneCount = 0
+
+      def triggerDone(): Unit = {
+        doneCount += 1
+        if (doneCount == 2) {
+          onDone()
+        }
+      }
+
+      a1.run(triggerDone)
+      a2.run(triggerDone)
+    }
+
+    def reversed: Animation = ParAnimation(a1.reversed, a2.reversed)
+  }
+
+  def animSeq(as: Seq[Animation]): Animation = as match {
+    case Seq() => throw new RuntimeException("To sequence animations, we need one animation at least!")
+    case Seq(a) => a
+    case Seq(a1, a2) => SeqAnimation(a1, a2)
+    case h +: tail => SeqAnimation(h, animSeq(tail))
+  }
+
+  def animPar(as: Seq[Animation]): Animation = as match {
+    case Seq() => throw new RuntimeException("To `par` animations, we need one animation at least!")
+    case Seq(a) => a
+    case Seq(a1, a2) => ParAnimation(a1, a2)
+    case h +: tail => ParAnimation(h, animPar(tail))
+  }
+}
modified   src/main/scala/net/kogics/kojo/core/Picture.scala
@@ -3,8 +3,7 @@ package core
 
 import java.awt.Paint
 import java.awt.geom.AffineTransform
-import java.awt.image.BufferedImage
-
+import java.awt.image.{BufferedImage, BufferedImageOp}
 import com.vividsolutions.jts.geom.Geometry
 
 import net.kogics.kojo.kgeom.PolyLine
@@ -13,6 +12,7 @@ import net.kogics.kojo.util.Vector2D
 
 import edu.umd.cs.piccolo.PNode
 import edu.umd.cs.piccolo.util.PBounds
+import net.kogics.kojo.picture.ImageOp
 
 trait Picture extends InputAware {
   def canvas: SCanvas
@@ -174,4 +174,25 @@ trait Picture extends InputAware {
     val pos0 = position
     animateToPosition(pos0.x + dx, pos0.y + dy, inMillis)(onEnd)
   }
+  def withRotation(angle: Double): Picture
+  def withRotationAround(angle: Double, x: Double, y: Double): Picture
+  def withTranslation(x: Double, y: Double): Picture
+  def withScaling(factor: Double): Picture
+  def withScalingAround(factor: Double, x: Double, y: Double): Picture
+  def withFillColor(color: Paint): Picture
+  def withPenColor(color: Paint): Picture
+  def withPenThickness(t: Double): Picture
+  def withEffect(filter: BufferedImageOp): Picture
+  def withEffect(filter: ImageOp): Picture
+  def withFlippedX: Picture
+  def withFlippedY: Picture
+  def withFading(distance: Int): Picture
+  def withBlurring(radius: Int): Picture
+  def withAxes: Picture
+  // The bounds transform is  tricky. If bounds are attached to the pic's parent's tnode,
+  // they get out of sync with the pic if the pic is translated etc.
+  // If they are attached to the pic's tnode, they change the pic's bounds!
+  //  def withBounds: Picture
+  def withOpacity(opacity: Double): Picture
+  def withPosition(x: Double, y: Double): Picture
 }
modified   src/main/scala/net/kogics/kojo/kmath/Kmath.scala
@@ -2,10 +2,8 @@ package net.kogics.kojo
 package kmath
 
 import scala.language.implicitConversions
-
 import org.apache.commons.math3.stat.StatUtils
 import org.apache.commons.math3.util.ArithmeticUtils
-
 import net.kogics.kojo.core.Point
 
 object Kmath {
@@ -16,9 +14,23 @@ object Kmath {
   def variance(nums: Array[Double]) = StatUtils.variance(nums)
   def variance(nums: Array[Double], mean: Double) = StatUtils.variance(nums, mean)
 
-  def constrain(value: Double, min: Double, max: Double) = util.Math.constrain(value, min, max)
-  def map(value: Double, start1: Double, stop1: Double, start2: Double, stop2: Double) = util.Math.map(value, start1, stop1, start2, stop2)
-  def lerp(start: Double, stop: Double, amt: Double) = util.Math.lerp(start, stop, amt)
+  def constrain(value: Double, min: Double, max: Double) = {
+    if (value < min) min
+    else if (value > max) max
+    else value
+  }
+
+  def map(value: Double, start1: Double, end1: Double, start2: Double, end2: Double) = {
+    val range1 = end1 - start1
+    val range2 = end2 - start2
+    start2 + range2 * (value - start1) / range1
+  }
+
+  def lerp(start: Double, end: Double, amt: Double) = {
+    require(amt >= 0d && amt <= 1d)
+    val range = end - start
+    start + amt * range
+  }
 
   def distance(x1: Double, y1: Double, x2: Double, y2: Double): Double =
     math.sqrt(math.pow(x2 - x1, 2) + math.pow(y2 - y1, 2))
new file   src/main/scala/net/kogics/kojo/kmath/easing.scala
@@ -0,0 +1,164 @@
+package net.kogics.kojo.kmath
+
+import net.kogics.kojo.util.Easing
+
+trait KEasing {
+  def ease(start: Double, end: Double, step: Double, duration: Double): Double
+}
+
+object KEasing {
+  val Linear = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.LINEAR.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val QuadIn = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.QUAD_IN.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val QuadOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.QUAD_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val QuadInOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.QUAD_IN_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val CubicIn = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.CUBIC_IN.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val CubicOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.CUBIC_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val CubicInOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.CUBIC_IN_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val QuarticIn = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.QUARTIC_IN.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val QuarticOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.QUARTIC_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val QuarticInOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.QUARTIC_IN_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val QuinticIn = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.QUINTIC_IN.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val QuinticOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.QUINTIC_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val QuinticInOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.QUINTIC_IN_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val ExpoIn = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.EXPO_IN.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val ExpoOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.EXPO_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val ExpoInOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.EXPO_IN_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val BackIn = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.BACK_IN.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val BackOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.BACK_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val BackInOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.BACK_IN_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val ElasticIn = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.ELASTIC_IN.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val ElasticOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.ELASTIC_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val ElasticInOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.ELASTIC_IN_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val BounceIn = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.BOUNCE_IN.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val BounceOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.BOUNCE_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val BounceInOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.BOUNCE_IN_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val SineIn = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.SINE_IN.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val SineOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.SINE_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val SineInOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.SINE_IN_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val CircIn = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.CIRC_IN.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val CircOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.CIRC_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+
+  val CircInOut = new KEasing {
+    override def ease(start: Double, end: Double, step: Double, duration: Double): Double =
+      Easing.CIRC_IN_OUT.ease(step.toFloat, start.toFloat, (end - start).toFloat, duration.toFloat)
+  }
+}
modified   src/main/scala/net/kogics/kojo/lite/AppMenu.scala
@@ -254,6 +254,7 @@ trait AppMenu {
     val animGameMenu = newJMenu(Utils.loadString("S_AnimationsGames"))
     animGameMenu.add(menuItemFor("S_LunarLander", "lunar-lander.kojo"))
     animGameMenu.add(menuItemFor("S_PulsatingLamp", "lamp-animation.kojo"))
+    animGameMenu.add(menuItemFor("S_PulsatingLamp2", "lamp-animation2.kojo"))
     animGameMenu.add(menuItemFor("S_TangramSkier", "tangram-skier.kojo"))
     animGameMenu.add(menuItemFor("S_Pong", "pong.kojo"))
     animGameMenu.add(menuItemFor("S_MemoryCards", "memory-cards.kojo"))
@@ -512,9 +513,10 @@ trait AppMenu {
               <li>Akka (https://akka.io/) for concurrency</li>
               <li>FlatLaf (https://github.com/JFormDesigner/FlatLaf) for the Kojo 'Look and Feel'</li>
               <li>libTiled (https://www.mapeditor.org/) to load game level files created with the Tiled Map Editor</li>
-              <li>Processing (https://processing.org/) for perlin noise and curved shapes</li>
+              <li>The Processing lib (https://processing.org/) for perlin noise and curved shapes</li>
               <li>Delaunay Triangulator (https://github.com/jdiemke/delaunay-triangulator) for triangulation of points</li>
               <li>Java implementation of HSLuv (https://github.com/hsluv/hsluv-java) for a perceptually uniform color space</li>
+              <li>The Penner easing functions for animation (https://github.com/mattdesl/cisc226game/blob/master/SpaceGame/src/space/engine/easing/Easing.java)</li>
               <li>Rhino (https://developer.mozilla.org/en-US/docs/Mozilla/Projects/Rhino) for the Code Exchange interface</li>
               </ul>
               </div>
modified   src/main/scala/net/kogics/kojo/lite/Builtins.scala
@@ -22,9 +22,11 @@ import java.awt.{Paint, Toolkit}
 import java.net.URL
 import com.jhlabs.image.AbstractBufferedImageOp
 import com.jhlabs.image.LightFilter.Light
+import net.kogics.kojo.animation.Animation
 
 import javax.swing.JComponent
 import net.kogics.kojo.core.{Rich2DPath, VertexShape, Voice}
+import net.kogics.kojo.kmath.KEasing
 import net.kogics.kojo.picture.{DslImpl, PicCache, PicDrawingDsl}
 import net.kogics.kojo.turtle.TurtleWorldAPI
 import net.kogics.kojo.util.{Throttler, UserCommand, Utils}
@@ -404,6 +406,7 @@ Here's a partial list of the available commands:
   }
   def drawAndHide(pictures: Picture*) = pictures.foreach { p => p.draw(); p.invisible() }
   def drawCentered(pic: Picture): Unit = {
+    checkForLargeDrawing()
     pic.invisible()
     pic.draw()
     center(pic)
@@ -601,8 +604,8 @@ Here's a partial list of the available commands:
     def rect(h: Double, w: Double) = picture.rect2(w, h)
     def rectangle(width: Double, height: Double) = picture.rect2(width, height)
     // def rectangle(x: Double, y: Double, w: Double, h: Double) = picture.offset(x, y) -> picture.rect2(w, h)
-    def vline(l: Double) = picture.vline(l)
-    def hline(l: Double) = picture.hline(l)
+    def vline(length: Double) = picture.vline(length)
+    def hline(length: Double) = picture.hline(length)
     def line(width: Double, height: Double) = picture.line(width, height)
     // def line(x1: Double, y1: Double, x2: Double, y2: Double) = picture.offset(x1, y1) -> picture.line(x2 - x1, y2 - y1)
     def fromPath(fn: GeneralPath => Unit) = picture.fromPath {
@@ -735,6 +738,30 @@ Here's a partial list of the available commands:
     }
   }
   val pm = PictureMaker
+
+  type Animation = animation.Animation
+  def Transition(durationSeconds: Int, fromState: Seq[Double], toState: Seq[Double], easer: KEasing,
+                 picMaker: Seq[Double] => Picture, hideOnDone: Boolean): Animation =
+    animation.Animation(durationSeconds, fromState, toState, easer, picMaker, hideOnDone)
+  def Timeline(duration: Double, keyFrames: animation.KeyFrames, easer: KEasing,
+               picMaker: Seq[Double] => Picture, hideOnDone: Boolean): Animation =
+    animation.Animation(duration, keyFrames, Seq.fill(keyFrames.frames.length - 1)(easer), picMaker, hideOnDone)
+  def Timeline(duration: Double, keyFrames: animation.KeyFrames, easers: Seq[KEasing],
+               picMaker: Seq[Double] => Picture, hideOnDone: Boolean): Animation =
+    animation.Animation(duration, keyFrames, easers, picMaker, hideOnDone)
+  implicit def iis2dds(is: (Int, Seq[Int])): (Double, Seq[Double]) = is match {
+    case (i, si) => (i.toDouble, si.map(_.toDouble))
+  }
+  implicit def ids2dds(is: (Int, Seq[Double])): (Double, Seq[Double]) = is match {
+    case (i, sd) => (i.toDouble, sd)
+  }
+  def KeyFrames(frames: (Double, Seq[Double])*)= animation.KeyFrames(frames)
+  def animSeq(as: Animation*): Animation = animSeq(as)
+  def animSeq(as: collection.Seq[Animation]): Animation = animation.animSeq(as.toSeq)
+  def animPar(as: Animation*): Animation = animPar(as)
+  def animPar(as: collection.Seq[Animation]): Animation = animation.animPar(as.toSeq)
+  def run(anim: Animation) = anim.run()
+
   type Widget = JComponent
   type TextField[A] = widget.TextField[A]
   type TextArea = widget.TextArea
@@ -905,7 +932,6 @@ Here's a partial list of the available commands:
   def rangeTo(start: Double, end: Double, step: Double) = Range.BigDecimal.inclusive(start, end, step)
   def rangeTill(start: Double, end: Double, step: Double) = Range.BigDecimal(start, end, step)
 
-  import scala.language.implicitConversions
   implicit def bd2double(bd: BigDecimal) = bd.doubleValue
 
   type CanvasDraw = net.kogics.kojo.lite.CanvasDraw
@@ -981,11 +1007,17 @@ Here's a partial list of the available commands:
   def insertOutputError(text: String): Unit = kojoCtx.insertOutputError(text)
 
   def animateWithRedraw[S](init: S, nextState: S => S, code: S => Picture): Unit = {
-    var state = init
-    tCanvas.animate {
+    import edu.umd.cs.piccolo.activities.PActivity
+    import java.util.concurrent.Future
+    lazy val anim: Future[PActivity] = tCanvas.animateWithState(init) { state =>
       tCanvas.erasePictures()
       draw(code(state))
-      state = nextState(state)
+      val newState = nextState(state)
+      if (newState == state) {
+        tCanvas.stopAnimationActivity(anim)
+      }
+      newState
     }
+    anim
   }
 }
modified   src/main/scala/net/kogics/kojo/lite/CoreBuiltins.scala
@@ -18,6 +18,7 @@ import net.kogics.kojo.turtle.LoTurtle
 import net.kogics.kojo.util.PerlinNoiseImproved
 import net.kogics.kojo.util.PerlinNoiseProcessing
 import net.kogics.kojo.util.Utils
+import net.kogics.kojo.picture.PicCache
 
 import io.github.jdiemke.triangulation.Triangle2D
 
@@ -74,6 +75,7 @@ trait CoreBuiltins extends Rationals {
 
   val kmath = net.kogics.kojo.kmath.Kmath
   val mathx = kmath
+  val easing = net.kogics.kojo.kmath.KEasing
 
   val slow = core.Slow
   val medium = core.Medium
@@ -229,9 +231,21 @@ trait CoreBuiltins extends Rationals {
   def scale(xf: Double, yf: Double) = picture.scale(xf, yf)
   def scalep(f: Double, x: Double, y: Double) = picture.scalep(f, x, y)
   def draw(pictures: Picture*): Unit = draw(pictures)
+  protected [lite] def checkForLargeDrawing(): Unit = {
+    if (PicCache.size > 60000) {
+      println("There are too many pics in your drawing, and trying to draw them might freeze Kojo.")
+      println("If you still want to go ahead with this, use the pic.draw() method.")
+      println("Or use Picture.fromSketch(...).")
+      assert(false, "Too many pics to draw - Kojo might freeze.")
+    }
+  }
   def draw(pictures: collection.Seq[Picture]): Unit = {
-    import net.kogics.kojo.picture.PicCache.freshPics
-    freshPics(pictures.toList).foreach(_.draw())
+    checkForLargeDrawing()
+    PicCache.freshPics(pictures.toList).foreach { pic =>
+      pic.invisible()
+      pic.draw()
+      pic.visible()
+    }
   }
   type Image = java.awt.Image
   def image(height: Int, width: Int) = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB)
modified   src/main/scala/net/kogics/kojo/lite/Versions.scala
@@ -2,9 +2,9 @@ package net.kogics.kojo.lite
 
 object Versions {
   val KojoMajorVersion = "2.9"
-  val KojoVersion = "2.9.15"
-  val KojoRevision = "r6"
-  val KojoBuildDate = "25 December 2021"
+  val KojoVersion = "2.9.17"
+  val KojoRevision = "r1"
+  val KojoBuildDate = "29 January 2022"
   val JavaVersion = {
     val jrv = System.getProperty("java.runtime.version")
     val arch = System.getProperty("os.arch")
modified   src/main/scala/net/kogics/kojo/lite/i18n/tr/dizim.scala
@@ -32,7 +32,7 @@ object Dizim {
 }
 class Dizim[T](val a: Array[T]) {
   def apply(b1: Sayı) = a(b1)
-  def boyut: Sayı = { // just an exercise -- not really needed 
+  @annotation.nowarn def boyut: Sayı = { // just an exercise -- not really needed
     var b = 1
     var p = a // scala style pointer
     var recurse = true
new file   src/main/scala/net/kogics/kojo/picture/PicCache.scala
@@ -0,0 +1,48 @@
+/*
+ * Copyright (C) 2017 Lalit Pant <pant.lalit@gmail.com>
+ *
+ * The contents of this file are subject to the GNU General Public License
+ * Version 3 (the "License"); you may not use this file
+ * except in compliance with the License. You may obtain a copy of
+ * the License at http://www.gnu.org/copyleft/gpl.html
+ *
+ * Software distributed under the License is distributed on an "AS
+ * IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or
+ * implied. See the License for the specific language governing
+ * rights and limitations under the License.
+ *
+ */
+package net.kogics.kojo.picture
+
+import net.kogics.kojo.core.Picture
+
+object PicCache {
+  var hits = 0
+  var misses = 0
+  val seen = new java.util.concurrent.ConcurrentHashMap[Picture, Int]()
+  def size = seen.size()
+
+  def clear(): Unit = {
+    seen.clear()
+    hits = 0
+    misses = 0
+  }
+
+  def freshPic(pic: Picture): Picture = {
+    if (seen.containsKey(pic)) {
+      val ret = pic.copy
+      seen.put(ret, 0)
+      hits += 1
+      ret
+    }
+    else {
+      seen.put(pic, 0)
+      misses += 1
+      pic
+    }
+  }
+
+  def freshPics(ps: collection.Seq[Picture]): collection.Seq[Picture] = {
+    ps map freshPic
+  }
+}
modified   src/main/scala/net/kogics/kojo/picture/package.scala
@@ -40,6 +40,7 @@ import net.kogics.kojo.core.SCanvas
 import net.kogics.kojo.util.Utils
 import net.kogics.kojo.util.Vector2D
 import core.Picture
+import net.kogics.kojo.picture.PicCache.freshPic
 
 package object picture {
   type Painter = core.Painter
@@ -60,7 +61,8 @@ package object picture {
   val flipX = FlipXc
   val flipY = FlipYc
   val axesOn = AxesOnc
-  def bounds = PostDrawTransformc { pic =>
+
+  private[picture] def picBounds(pic: Picture): Unit = Utils.runInSwingThread {
     import edu.umd.cs.piccolo.nodes.PPath
     val b = pic.bounds
     val bRect = PPath.createRectangle(b.x.toFloat, b.y.toFloat, b.width.toFloat, b.height.toFloat)
@@ -69,6 +71,10 @@ package object picture {
     tnode.getParent.addChild(bRect)
     tnode.getParent.repaint()
   }
+
+  def bounds = PostDrawTransformc { pic =>
+    picBounds(pic)
+  }
   def fill(color: Paint) = Fillc(color)
   def stroke(color: Paint) = Strokec(color)
   def strokeWidth(w: Double) = StrokeWidthc(w)
@@ -148,16 +154,9 @@ package object picture {
     Utils.trect(h, w, t)
   }
 
-  def vline(l: Double)(implicit canvas: SCanvas) = Pic { t =>
-    import t._
-    forward(l)
-  }
+  def vline(length: Double)(implicit canvas: SCanvas) = line(0, length)
 
-  def hline(l: Double)(implicit canvas: SCanvas) = Pic { t =>
-    import t._
-    right()
-    forward(l)
-  }
+  def hline(length: Double)(implicit canvas: SCanvas) = line(length, 0)
 
   def circle(r: Double)(implicit canvas: SCanvas) = new CirclePic(r)
 
@@ -467,4 +466,9 @@ package object picture {
     val cv = collisionVector
     vel.bounceOff(cv)
   }
+
+  protected[picture] def epic(p: Picture) = p match {
+    case ep: EffectablePicture => ep
+    case _                     => new EffectableImagePic(freshPic(p))(p.canvas)
+  }
 }
modified   src/main/scala/net/kogics/kojo/picture/picdsl.scala
@@ -46,33 +46,6 @@ trait PicDrawingDsl {
   def atRt(r: Double, theta: Double) = at(r * math.cos(theta.toRadians), r * math.sin(theta.toRadians))
 }
 
-object PicCache {
-  var hits = 0
-  var misses = 0
-  val seen = new java.util.concurrent.ConcurrentHashMap[Picture, Int]()
-  def clear(): Unit = {
-    seen.clear()
-    hits = 0
-    misses = 0
-  }
-  def freshPic(pic: Picture): Picture = {
-    if (seen.containsKey(pic)) {
-      val ret = pic.copy
-      seen.put(ret, 0)
-      hits += 1
-      ret
-    }
-    else {
-      seen.put(pic, 0)
-      misses += 1
-      pic
-    }
-  }
-  def freshPics(ps: collection.Seq[Picture]): collection.Seq[Picture] = {
-    ps map freshPic
-  }
-}
-
 case class DslImpl(pic: Picture) extends PicDrawingDsl {
   import PicCache.freshPic
   val drawnMsg = "Picture has already been drawn; drawing function '%s 'is not available."
modified   src/main/scala/net/kogics/kojo/picture/picimage.scala
@@ -206,9 +206,9 @@ class EffectableImagePic(pic: Picture)(implicit val canvas: SCanvas) extends Pic
       picLayer.removeChild(pic.tnode)
       tnode.addChild(pimage(pic.toImage))
       tnode.translate(pic.bounds.x, pic.bounds.y)
-      if (!pic.isInstanceOf[ImagePic]) {
-        tnode.translate(-1, 0)
-      }
+//      if (!pic.isInstanceOf[ImagePic]) {
+//        tnode.translate(-1, 0)
+//      }
       tnode.setVisible(true)
       tnode.repaint()
     }
@@ -342,12 +342,7 @@ case class ApplyFilter(filter: BufferedImageOp)(pic: EffectablePicture) extends
   override def toString() = s"ApplyFilter($filter) (Id: ${System.identityHashCode(this)}) -> ${tpic.toString}"
 }
 
-abstract class ComposableImageEffect extends ComposableTransformer {
-  def epic(p: Picture) = p match {
-    case ep: EffectablePicture => ep
-    case _                     => new EffectableImagePic(p)(p.canvas)
-  }
-}
+abstract class ComposableImageEffect extends ComposableTransformer
 
 case class Fadec(n: Int) extends ComposableImageEffect {
   def apply(p: Picture) = Fade(n)(epic(p))
modified   src/main/scala/net/kogics/kojo/picture/pics.scala
@@ -16,11 +16,13 @@
 package net.kogics.kojo
 package picture
 
+import com.jhlabs.image.AbstractBufferedImageOp
+
 import java.awt.BasicStroke
 import java.awt.Color
 import java.awt.Paint
 import java.awt.geom.AffineTransform
-import java.awt.image.BufferedImage
+import java.awt.image.{BufferedImage, BufferedImageOp}
 import java.util.concurrent.Future
 
 import scala.collection.mutable.ArrayBuffer
@@ -37,7 +39,7 @@ import net.kogics.kojo.core.Pixel
 import net.kogics.kojo.core.SCanvas
 import net.kogics.kojo.kgeom.PolyLine
 import net.kogics.kojo.picture.PicCache.freshPics
-import net.kogics.kojo.util.Math
+import net.kogics.kojo.kmath.{Kmath => Math}
 import net.kogics.kojo.util.Utils
 
 import edu.umd.cs.piccolo.PNode
@@ -314,6 +316,7 @@ trait CorePicOps extends GeomPolygon with UnsupportedOps { self: Picture with Re
   def update(newData: Any): Unit = notSupported("update", "for immutable picture")
 }
 
+// Ops that transforms cannot delegate to their underlying tpic
 trait CorePicOps2 extends GeomPolygon { self: Picture =>
   def picLayer = canvas.pictures
   var reactions = Vector.empty[Future[PActivity]]
@@ -386,6 +389,33 @@ trait CorePicOps2 extends GeomPolygon { self: Picture =>
   def beside(other: Picture): Picture = HPics2(this, other)
   def above(other: Picture): Picture = VPics2(other, this)
   def on(other: Picture): Picture = GPics2(other, this)
+
+  def withRotation(angle: Double): Picture = PostDrawTransform { pic => pic.rotate(angle) }(this)
+  def withRotationAround(angle: Double, x: Double, y: Double): Picture =
+    PostDrawTransform { pic => pic.rotateAboutPoint(angle, x, y) }(this)
+  def withTranslation(x: Double, y: Double): Picture = PostDrawTransform { pic => pic.translate(x, y) }(this)
+  def withScaling(factor: Double): Picture = PostDrawTransform { pic => pic.scale(factor) }(this)
+  def withScalingAround(factor: Double, x: Double, y: Double): Picture =
+    PostDrawTransform { pic => pic.scaleAboutPoint(factor, x, y) }(this)
+  def withFillColor(color: Paint): Picture = PostDrawTransform { pic => pic.setFillColor(color) }(this)
+  def withPenColor(color: Paint): Picture = PostDrawTransform { pic => pic.setPenColor(color) }(this)
+  def withPenThickness(t: Double): Picture = PostDrawTransform { pic => pic.setPenThickness(t) }(this)
+  def withEffect(filter: BufferedImageOp): Picture = ApplyFilter(filter)(epic(this))
+
+  def withEffect(filterOp: ImageOp): Picture = {
+    val filter2 = new AbstractBufferedImageOp {
+      def filter(src: BufferedImage, dest: BufferedImage) = filterOp.filter(src)
+    }
+    withEffect(filter2)
+  }
+  def withFlippedX: Picture = FlipY(this)
+  def withFlippedY: Picture  = FlipX(this)
+  def withFading(distance: Int): Picture  = Fade(distance)(epic(this))
+  def withBlurring(radius: Int): Picture = Blur(radius)(epic(this))
+  def withAxes: Picture = PostDrawTransform { pic => pic.axesOn() }(this)
+  //  def withBounds: Picture = PostDrawTransform { pic => picBounds(pic) }(this)
+  def withOpacity(opacity: Double): Picture = PostDrawTransform { pic => pic.setOpacity(opacity) }(this)
+  def withPosition(x: Double, y: Double): Picture = PostDrawTransform { pic => pic.setPosition(x, y) }(this)
 }
 
 trait RedrawStopper extends Picture {
modified   src/main/scala/net/kogics/kojo/staging/color.scala
@@ -16,7 +16,7 @@
 package net.kogics.kojo
 package staging
 
-import util.Math
+import kmath.{Kmath => Math}
 
 import javax.swing._
 
modified   src/main/scala/net/kogics/kojo/staging/staging.scala
@@ -18,7 +18,7 @@ package net.kogics.kojo
 package staging
 
 import util.Utils
-import util.Math
+import kmath.{Kmath => Math}
 import core.InputAware
 import core.Point
 import java.awt.BasicStroke
deleted    src/main/scala/net/kogics/kojo/util/Math.scala
@@ -1,36 +0,0 @@
-/*
- * Copyright (C) 2010 Peter Lewerin <peter.lewerin@tele2.se>
- *
- * The contents of this file are subject to the GNU General Public License
- * Version 3 (the "License"); you may not use this file
- * except in compliance with the License. You may obtain a copy of
- * the License at http://www.gnu.org/copyleft/gpl.html
- *
- * Software distributed under the License is distributed on an "AS
- * IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or
- * implied. See the License for the specific language governing
- * rights and limitations under the License.
- *
- */
-
-package net.kogics.kojo.util
-
-object Math {
-  def constrain(value: Double, min: Double, max: Double) = {
-    if (value < min) min
-    else if (value > max) max
-    else value
-  }
-
-  def map(value: Double, low1: Double, high1: Double, low2: Double, high2: Double) = {
-    val range1: Double = high1 - low1
-    val range2: Double = high2 - low2
-    low2 + range2 * (value - low1) / range1
-  }
-
-  def lerp(value1: Double, value2: Double, amt: Double) = {
-    require(amt >= 0d && amt <= 1d)
-    val range: Double = value2 - value1
-    value1 + amt * range
-  }
-}
modified   src/main/scala/net/kogics/kojo/util/Utils.scala
@@ -910,7 +910,7 @@ object Utils {
   def increaseSysTimerResolutionIfNeeded(): Unit = {
     if (isWin) {
       if (timerThreadCount.getAndIncrement == 0) {
-        runAsyncMonitored {
+        runAsync {
           try {
             // The irregularly long sleep makes the JVM set the OS timer resolution to 1 ms
             Thread.sleep(Int.MaxValue)
modified   src/main/scala/net/kogics/kojo/xscala/CodeTemplates.scala
@@ -105,6 +105,72 @@ draw(pic)
 """,
     "canvasSketch" -> canvasSketch,
     "sketchpic" -> canvasSketch,
+    "transition" -> """cleari()
+                      |drawStage(white)
+                      |
+                      |def pic = Picture.rectangle(100, 50)
+                      |
+                      |def xProp(s: Seq[Double]) = s(0)
+                      |def yProp(s: Seq[Double]) = s(1)
+                      |def hueProp(s: Seq[Double]) = s(2)
+                      |def scaleProp(s: Seq[Double]) = s(3)
+                      |
+                      |def makePic(s: Seq[Double]) = {
+                      |    fillColor(cm.hsl(hueProp(s), 1, 0.5)) *
+                      |        trans(xProp(s), yProp(s)) *
+                      |        scale(scaleProp(s)) ->
+                      |        pic
+                      |}
+                      |${cursor}
+                      |val anim = Transition(
+                      |    2,
+                      |    Seq(0, 100, 0, 1),
+                      |    Seq(300, 50, 240, 0.7),
+                      |    easing.QuadInOut,
+                      |    makePic,
+                      |    true
+                      |)
+                      |
+                      |run(anim)
+                      |""".stripMargin,
+    "timeline" -> """cleari()
+                    |drawStage(white)
+                    |
+                    |def pic = Picture.rectangle(100, 50)
+                    |
+                    |def xProp(s: Seq[Double]) = s(0)
+                    |def yProp(s: Seq[Double]) = s(1)
+                    |def hueProp(s: Seq[Double]) = s(2)
+                    |def scaleProp(s: Seq[Double]) = s(3)
+                    |
+                    |def makePic(s: Seq[Double]) = {
+                    |    fillColor(cm.hsl(hueProp(s), 1, 0.5)) *
+                    |        trans(xProp(s), yProp(s)) *
+                    |        scale(scaleProp(s)) ->
+                    |        pic
+                    |}
+                    |
+                    |val kf = KeyFrames(
+                    |    0 -> Seq(0, 100, 0, 1),
+                    |    50 -> Seq(100, -50, 60, 1),
+                    |    100 -> Seq(300, 50, 240, 0.7)
+                    |)
+                    |
+                    |val easings = Seq(
+                    |    easing.QuadIn,
+                    |    easing.QuadOut
+                    |)
+                    |${cursor}
+                    |val anim = Timeline(
+                    |    4,
+                    |    kf,
+                    |    easings,
+                    |    makePic,
+                    |    false
+                    |)
+                    |
+                    |run(anim)
+                    |""".stripMargin,
     "test" -> """test("testName") {
     import Matchers._
     ${cursor}

Unmerged into origin/master (1)
87e88a3c master Tweaks to turkish documentation

Unpulled from origin/master (30)
8e4f9336 origin/master Animation transitions should be at the final state when they finish.
b3c8df81 Bump up license year.
702bdba0 Bump up install4j to 9.0.5, and bundled JRE to 11.0.13-xx.
cdb8339a Tweaks.
01a3853e Tweaks.
0d0954f8 Bump up installer version number to 2.9.16
7c859c49 Bump up Scala version to 2.13.8
2695a282 Refinements.
6e3be674 Refinements.
efdf37b8 Add more Penner easings for animation.
ef2cfe44 Add method based transformations for pictures - for rotating and scaling around a given point. Plus tweaks.
4fc679b5 Add method based transformations for pictures - flippedX, flippedY, fading, and blurring.
62d46055 Add a couple of easing types (elasticX and bounceX).
b880f343 Add a version of the "pulsating lamp" sample based on Transitions. Plus tweaks.
e45d2b1a Support different easings for different segments of an animation timeline.
9c203c61 Add code templates for transitions and timelines.
a26bc4db Tweaks.
cf4c66b4 Tweaks.
ac4c3a84 Tweaks.
2d78346b Provide support for core picture (functional) transformations via methods.
e09ea942 Run background thread that increases timer-resolution on Windows as a non-monitored thread, to tweak the stop button behavior when running composable animations.
ba126c1d Animation tweaks.
9f32b754 Merge pull request #51 from bulent2k2/master
07b53a63 Tweaks.
57a0c590 Animations - keyframe start times are now percentages. Plus support for repeated animations.
cdcc0739 Composable animations enhancements - Transitions and Timeline with Keyframes (WIP).
6578a4fa Merge branch 'litan:master' into master
ea94310b Composable animations enhancements (WIP).
27eb1b73 Composable animations enhancement (WIP).
064cbf58 Get composable animations going (WIP).

* The End
