# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.brandonang.doggymaths2.DoggyMaths2 {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/brandonang/doggymaths2/repack'
-flattenpackagehierarchy
-dontpreverify
