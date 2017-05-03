# App crashes upon opening for unknown reasons


                  --------- beginning of crash
E/AndroidRuntime: FATAL EXCEPTION: main
                  Process: com.introtoandriod.stockquotes_keane, PID: 3654
                  java.lang.RuntimeException: Unable to instantiate activity ComponentInfo{com.introtoandriod.stockquotes_keane/com.introtoandriod.stockquotes_keane.MainActivity}: java.lang.NullPointerException: Attempt to invoke virtual method 'android.view.Window$Callback android.view.Window.getCallback()' on a null object reference
                      at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2548)
                      at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2707)
                      at android.app.ActivityThread.-wrap12(ActivityThread.java)
                      at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1460)
                      at android.os.Handler.dispatchMessage(Handler.java:102)
                      at android.os.Looper.loop(Looper.java:154)
                      at android.app.ActivityThread.main(ActivityThread.java:6077)
                      at java.lang.reflect.Method.invoke(Native Method)
                      at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:865)
                      at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:755)
                   Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'android.view.Window$Callback android.view.Window.getCallback()' on a null object reference
                      at android.support.v7.app.AppCompatDelegateImplBase.<init>(AppCompatDelegateImplBase.java:120)
                      at android.support.v7.app.AppCompatDelegateImplV9.<init>(AppCompatDelegateImplV9.java:151)
                      at android.support.v7.app.AppCompatDelegateImplV11.<init>(AppCompatDelegateImplV11.java:31)
                      at android.support.v7.app.AppCompatDelegateImplV14.<init>(AppCompatDelegateImplV14.java:55)
                      at android.support.v7.app.AppCompatDelegateImplV23.<init>(AppCompatDelegateImplV23.java:33)
                      at android.support.v7.app.AppCompatDelegateImplN.<init>(AppCompatDelegateImplN.java:33)
                      at android.support.v7.app.AppCompatDelegate.create(AppCompatDelegate.java:201)
                      at android.support.v7.app.AppCompatDelegate.create(AppCompatDelegate.java:185)
                      at android.support.v7.app.AppCompatActivity.getDelegate(AppCompatActivity.java:525)
                      at android.support.v7.app.AppCompatActivity.findViewById(AppCompatActivity.java:193)
                      at com.introtoandriod.stockquotes_keane.MainActivity.<init>(MainActivity.java:17)
                      at java.lang.Class.newInstance(Native Method)
                      at android.app.Instrumentation.newActivity(Instrumentation.java:1078)
                      at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2538)
                      at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2707) 
                      at android.app.ActivityThread.-wrap12(ActivityThread.java) 
                      at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1460) 
                      at android.os.Handler.dispatchMessage(Handler.java:102) 
                      at android.os.Looper.loop(Looper.java:154) 
                      at android.app.ActivityThread.main(ActivityThread.java:6077) 
                      at java.lang.reflect.Method.invoke(Native Method) 
                      at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:865) 
                      at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:755)
