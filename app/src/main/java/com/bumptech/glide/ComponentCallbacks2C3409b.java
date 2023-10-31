package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.C0470b;
import cn.hutool.core.codec.C2026c;
import com.bumptech.glide.C3430h;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.InterfaceC3583k;
import com.bumptech.glide.load.data.C3464k;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.C3549n;
import com.bumptech.glide.load.engine.bitmap_recycle.C3486e;
import com.bumptech.glide.load.engine.bitmap_recycle.C3491i;
import com.bumptech.glide.load.engine.bitmap_recycle.C3494j;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3485d;
import com.bumptech.glide.load.engine.cache.C3515g;
import com.bumptech.glide.load.engine.cache.C3516h;
import com.bumptech.glide.load.engine.cache.C3519j;
import com.bumptech.glide.load.engine.cache.InterfaceC3517i;
import com.bumptech.glide.load.engine.executor.ExecutorServiceC3527a;
import com.bumptech.glide.load.model.C3586a;
import com.bumptech.glide.load.model.C3590b;
import com.bumptech.glide.load.model.C3597c;
import com.bumptech.glide.load.model.C3598d;
import com.bumptech.glide.load.model.C3601e;
import com.bumptech.glide.load.model.C3606f;
import com.bumptech.glide.load.model.C3614g;
import com.bumptech.glide.load.model.C3620k;
import com.bumptech.glide.load.model.C3654t;
import com.bumptech.glide.load.model.C3659u;
import com.bumptech.glide.load.model.C3660v;
import com.bumptech.glide.load.model.C3664w;
import com.bumptech.glide.load.model.C3667x;
import com.bumptech.glide.load.model.C3672y;
import com.bumptech.glide.load.model.stream.C3639a;
import com.bumptech.glide.load.model.stream.C3641b;
import com.bumptech.glide.load.model.stream.C3643c;
import com.bumptech.glide.load.model.stream.C3645d;
import com.bumptech.glide.load.model.stream.C3652g;
import com.bumptech.glide.load.resource.bitmap.C3676a;
import com.bumptech.glide.load.resource.bitmap.C3677a0;
import com.bumptech.glide.load.resource.bitmap.C3678b;
import com.bumptech.glide.load.resource.bitmap.C3679b0;
import com.bumptech.glide.load.resource.bitmap.C3681c;
import com.bumptech.glide.load.resource.bitmap.C3685d0;
import com.bumptech.glide.load.resource.bitmap.C3690f0;
import com.bumptech.glide.load.resource.bitmap.C3699g;
import com.bumptech.glide.load.resource.bitmap.C3701h;
import com.bumptech.glide.load.resource.bitmap.C3704k;
import com.bumptech.glide.load.resource.bitmap.C3720p;
import com.bumptech.glide.load.resource.bitmap.C3726s;
import com.bumptech.glide.load.resource.bitmap.C3732w;
import com.bumptech.glide.load.resource.bitmap.C3734y;
import com.bumptech.glide.load.resource.bytes.C3737a;
import com.bumptech.glide.load.resource.drawable.C3745d;
import com.bumptech.glide.load.resource.drawable.C3746e;
import com.bumptech.glide.load.resource.file.C3749a;
import com.bumptech.glide.load.resource.gif.C3753a;
import com.bumptech.glide.load.resource.gif.C3757c;
import com.bumptech.glide.load.resource.gif.C3759d;
import com.bumptech.glide.load.resource.gif.C3766h;
import com.bumptech.glide.load.resource.gif.C3768j;
import com.bumptech.glide.load.resource.transcode.C3771a;
import com.bumptech.glide.load.resource.transcode.C3772b;
import com.bumptech.glide.load.resource.transcode.C3773c;
import com.bumptech.glide.load.resource.transcode.C3774d;
import com.bumptech.glide.manager.C3787f;
import com.bumptech.glide.manager.C3798p;
import com.bumptech.glide.manager.InterfaceC3784d;
import com.bumptech.glide.module.C3810e;
import com.bumptech.glide.module.InterfaceC3808c;
import com.bumptech.glide.provider.C3814b;
import com.bumptech.glide.util.C3856g;
import com.bumptech.glide.util.C3861k;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.b */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C3409b implements ComponentCallbacks2 {
    @GuardedBy("Glide.class")

    /* renamed from: i */
    public static volatile ComponentCallbacks2C3409b f9031i;

    /* renamed from: j */
    public static volatile boolean f9032j;

    /* renamed from: a */
    public final InterfaceC3485d f9033a;

    /* renamed from: b */
    public final InterfaceC3517i f9034b;

    /* renamed from: c */
    public final C3424g f9035c;

    /* renamed from: d */
    public final C3433j f9036d;

    /* renamed from: e */
    public final InterfaceC3483b f9037e;

    /* renamed from: f */
    public final C3798p f9038f;

    /* renamed from: g */
    public final InterfaceC3784d f9039g;
    @GuardedBy("managers")

    /* renamed from: h */
    public final ArrayList f9040h = new ArrayList();

    /* renamed from: com.bumptech.glide.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3410a {
    }

    public ComponentCallbacks2C3409b(@NonNull Context context, @NonNull C3549n c3549n, @NonNull InterfaceC3517i interfaceC3517i, @NonNull InterfaceC3485d interfaceC3485d, @NonNull InterfaceC3483b interfaceC3483b, @NonNull C3798p c3798p, @NonNull InterfaceC3784d interfaceC3784d, int i, @NonNull C3411c c3411c, @NonNull C0470b c0470b, @NonNull List list, C3430h c3430h) {
        InterfaceC3583k c3699g;
        InterfaceC3583k c3679b0;
        this.f9033a = interfaceC3485d;
        this.f9037e = interfaceC3483b;
        this.f9034b = interfaceC3517i;
        this.f9038f = c3798p;
        this.f9039g = interfaceC3784d;
        Resources resources = context.getResources();
        C3433j c3433j = new C3433j();
        this.f9036d = c3433j;
        C3704k c3704k = new C3704k();
        C3814b c3814b = c3433j.f9145g;
        synchronized (c3814b) {
            c3814b.f9834a.add(c3704k);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            c3433j.m6740h(new C3726s());
        }
        ArrayList m6742f = c3433j.m6742f();
        C3753a c3753a = new C3753a(context, m6742f, interfaceC3485d, interfaceC3483b);
        C3690f0 c3690f0 = new C3690f0(interfaceC3485d, new C3690f0.C3697g());
        C3720p c3720p = new C3720p(c3433j.m6742f(), resources.getDisplayMetrics(), interfaceC3485d, interfaceC3483b);
        if (!c3430h.f9132a.containsKey(C3412d.class) || i2 < 28) {
            c3699g = new C3699g(c3720p);
            c3679b0 = new C3679b0(c3720p, interfaceC3483b);
        } else {
            c3679b0 = new C3732w();
            c3699g = new C3701h();
        }
        C3745d c3745d = new C3745d(context);
        C3654t.C3657c c3657c = new C3654t.C3657c(resources);
        C3654t.C3658d c3658d = new C3654t.C3658d(resources);
        C3654t.C3656b c3656b = new C3654t.C3656b(resources);
        C3654t.C3655a c3655a = new C3654t.C3655a(resources);
        C3681c c3681c = new C3681c(interfaceC3483b);
        C3771a c3771a = new C3771a();
        C3774d c3774d = new C3774d();
        ContentResolver contentResolver = context.getContentResolver();
        c3433j.m6746b(ByteBuffer.class, new C3597c());
        c3433j.m6746b(InputStream.class, new C3659u(interfaceC3483b));
        c3433j.m6747a(c3699g, ByteBuffer.class, Bitmap.class, "Bitmap");
        c3433j.m6747a(c3679b0, InputStream.class, Bitmap.class, "Bitmap");
        c3433j.m6747a(new C3734y(c3720p), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        c3433j.m6747a(c3690f0, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        c3433j.m6747a(new C3690f0(interfaceC3485d, new C3690f0.C3693c()), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        C3664w.C3665a<?> c3665a = C3664w.C3665a.f9624a;
        c3433j.m6744d(Bitmap.class, Bitmap.class, c3665a);
        c3433j.m6747a(new C3685d0(), Bitmap.class, Bitmap.class, "Bitmap");
        c3433j.m6745c(Bitmap.class, c3681c);
        c3433j.m6747a(new C3676a(resources, c3699g), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        c3433j.m6747a(new C3676a(resources, c3679b0), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        c3433j.m6747a(new C3676a(resources, c3690f0), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        c3433j.m6745c(BitmapDrawable.class, new C3678b(interfaceC3485d, c3681c));
        c3433j.m6747a(new C3768j(m6742f, c3753a, interfaceC3483b), InputStream.class, C3757c.class, "Gif");
        c3433j.m6747a(c3753a, ByteBuffer.class, C3757c.class, "Gif");
        c3433j.m6745c(C3757c.class, new C3759d());
        c3433j.m6744d(GifDecoder.class, GifDecoder.class, c3665a);
        c3433j.m6747a(new C3766h(interfaceC3485d), GifDecoder.class, Bitmap.class, "Bitmap");
        c3433j.m6747a(c3745d, Uri.class, Drawable.class, "legacy_append");
        c3433j.m6747a(new C3677a0(c3745d, interfaceC3485d), Uri.class, Bitmap.class, "legacy_append");
        c3433j.m6739i(new C3737a.C3738a());
        c3433j.m6744d(File.class, ByteBuffer.class, new C3598d.C3600b());
        c3433j.m6744d(File.class, InputStream.class, new C3606f.C3612e());
        c3433j.m6747a(new C3749a(), File.class, File.class, "legacy_append");
        c3433j.m6744d(File.class, ParcelFileDescriptor.class, new C3606f.C3608b());
        c3433j.m6744d(File.class, File.class, c3665a);
        c3433j.m6739i(new C3464k.C3465a(interfaceC3483b));
        c3433j.m6739i(new ParcelFileDescriptorRewinder.C3448a());
        Class cls = Integer.TYPE;
        c3433j.m6744d(cls, InputStream.class, c3657c);
        c3433j.m6744d(cls, ParcelFileDescriptor.class, c3656b);
        c3433j.m6744d(Integer.class, InputStream.class, c3657c);
        c3433j.m6744d(Integer.class, ParcelFileDescriptor.class, c3656b);
        c3433j.m6744d(Integer.class, Uri.class, c3658d);
        c3433j.m6744d(cls, AssetFileDescriptor.class, c3655a);
        c3433j.m6744d(Integer.class, AssetFileDescriptor.class, c3655a);
        c3433j.m6744d(cls, Uri.class, c3658d);
        c3433j.m6744d(String.class, InputStream.class, new C3601e.C3604c());
        c3433j.m6744d(Uri.class, InputStream.class, new C3601e.C3604c());
        c3433j.m6744d(String.class, InputStream.class, new C3660v.C3663c());
        c3433j.m6744d(String.class, ParcelFileDescriptor.class, new C3660v.C3662b());
        c3433j.m6744d(String.class, AssetFileDescriptor.class, new C3660v.C3661a());
        c3433j.m6744d(Uri.class, InputStream.class, new C3586a.C3589c(context.getAssets()));
        c3433j.m6744d(Uri.class, ParcelFileDescriptor.class, new C3586a.C3588b(context.getAssets()));
        c3433j.m6744d(Uri.class, InputStream.class, new C3641b.C3642a(context));
        c3433j.m6744d(Uri.class, InputStream.class, new C3643c.C3644a(context));
        if (i2 >= 29) {
            c3433j.m6744d(Uri.class, InputStream.class, new C3645d.C3648c(context));
            c3433j.m6744d(Uri.class, ParcelFileDescriptor.class, new C3645d.C3647b(context));
        }
        c3433j.m6744d(Uri.class, InputStream.class, new C3667x.C3671d(contentResolver));
        c3433j.m6744d(Uri.class, ParcelFileDescriptor.class, new C3667x.C3669b(contentResolver));
        c3433j.m6744d(Uri.class, AssetFileDescriptor.class, new C3667x.C3668a(contentResolver));
        c3433j.m6744d(Uri.class, InputStream.class, new C3672y.C3673a());
        c3433j.m6744d(URL.class, InputStream.class, new C3652g.C3653a());
        c3433j.m6744d(Uri.class, File.class, new C3620k.C3621a(context));
        c3433j.m6744d(C3614g.class, InputStream.class, new C3639a.C3640a());
        c3433j.m6744d(byte[].class, ByteBuffer.class, new C3590b.C3591a());
        c3433j.m6744d(byte[].class, InputStream.class, new C3590b.C3595d());
        c3433j.m6744d(Uri.class, Uri.class, c3665a);
        c3433j.m6744d(Drawable.class, Drawable.class, c3665a);
        c3433j.m6747a(new C3746e(), Drawable.class, Drawable.class, "legacy_append");
        c3433j.m6738j(Bitmap.class, BitmapDrawable.class, new C3772b(resources));
        c3433j.m6738j(Bitmap.class, byte[].class, c3771a);
        c3433j.m6738j(Drawable.class, byte[].class, new C3773c(interfaceC3485d, c3771a, c3774d));
        c3433j.m6738j(C3757c.class, byte[].class, c3774d);
        C3690f0 c3690f02 = new C3690f0(interfaceC3485d, new C3690f0.C3694d());
        c3433j.m6747a(c3690f02, ByteBuffer.class, Bitmap.class, "legacy_append");
        c3433j.m6747a(new C3676a(resources, c3690f02), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        this.f9035c = new C3424g(context, interfaceC3483b, c3433j, new C2026c(), c3411c, c0470b, list, c3549n, c3430h, i);
    }

    @GuardedBy("Glide.class")
    /* renamed from: a */
    public static void m6787a(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        int i;
        C3411c c3411c;
        InterfaceC3485d c3486e;
        if (!f9032j) {
            f9032j = true;
            C0470b c0470b = new C0470b();
            C3430h.C3431a c3431a = new C3430h.C3431a();
            C3411c c3411c2 = new C3411c();
            Context applicationContext = context.getApplicationContext();
            Collections.emptyList();
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData == null) {
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Got null app info metadata");
                    }
                } else {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList.add(C3810e.m6479a(str));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + str);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                }
                if (generatedAppGlideModule != null && !generatedAppGlideModule.m6788c().isEmpty()) {
                    Set<Class<?>> m6788c = generatedAppGlideModule.m6788c();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        InterfaceC3808c interfaceC3808c = (InterfaceC3808c) it.next();
                        if (m6788c.contains(interfaceC3808c.getClass())) {
                            if (Log.isLoggable("Glide", 3)) {
                                Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + interfaceC3808c);
                            }
                            it.remove();
                        }
                    }
                }
                if (Log.isLoggable("Glide", 3)) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Log.d("Glide", "Discovered GlideModule from manifest: " + ((InterfaceC3808c) it2.next()).getClass());
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((InterfaceC3808c) it3.next()).m6480b();
                }
                if (ExecutorServiceC3527a.f9326c == 0) {
                    ExecutorServiceC3527a.f9326c = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i2 = ExecutorServiceC3527a.f9326c;
                if (!TextUtils.isEmpty(FirebaseAnalytics.Param.SOURCE)) {
                    ExecutorServiceC3527a executorServiceC3527a = new ExecutorServiceC3527a(new ThreadPoolExecutor(i2, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ExecutorServiceC3527a.ThreadFactoryC3528a(FirebaseAnalytics.Param.SOURCE, false)));
                    int i3 = ExecutorServiceC3527a.f9326c;
                    if (!TextUtils.isEmpty("disk-cache")) {
                        ExecutorServiceC3527a executorServiceC3527a2 = new ExecutorServiceC3527a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ExecutorServiceC3527a.ThreadFactoryC3528a("disk-cache", true)));
                        if (ExecutorServiceC3527a.f9326c == 0) {
                            ExecutorServiceC3527a.f9326c = Math.min(4, Runtime.getRuntime().availableProcessors());
                        }
                        if (ExecutorServiceC3527a.f9326c >= 4) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                        if (!TextUtils.isEmpty("animation")) {
                            ExecutorServiceC3527a executorServiceC3527a3 = new ExecutorServiceC3527a(new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ExecutorServiceC3527a.ThreadFactoryC3528a("animation", true)));
                            C3519j c3519j = new C3519j(new C3519j.C3520a(applicationContext));
                            C3787f c3787f = new C3787f();
                            int i4 = c3519j.f9303a;
                            if (i4 > 0) {
                                c3411c = c3411c2;
                                c3486e = new C3494j(i4);
                            } else {
                                c3411c = c3411c2;
                                c3486e = new C3486e();
                            }
                            C3491i c3491i = new C3491i(c3519j.f9305c);
                            C3516h c3516h = new C3516h(c3519j.f9304b);
                            C3549n c3549n = new C3549n(c3516h, new C3515g(applicationContext), executorServiceC3527a2, executorServiceC3527a, new ExecutorServiceC3527a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, ExecutorServiceC3527a.f9325b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ExecutorServiceC3527a.ThreadFactoryC3528a("source-unlimited", false))), executorServiceC3527a3);
                            List emptyList = Collections.emptyList();
                            C3430h c3430h = new C3430h(c3431a);
                            ComponentCallbacks2C3409b componentCallbacks2C3409b = new ComponentCallbacks2C3409b(applicationContext, c3549n, c3516h, c3486e, c3491i, new C3798p(null, c3430h), c3787f, 4, c3411c, c0470b, emptyList, c3430h);
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                InterfaceC3808c interfaceC3808c2 = (InterfaceC3808c) it4.next();
                                try {
                                    interfaceC3808c2.m6477a();
                                } catch (AbstractMethodError e) {
                                    throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(interfaceC3808c2.getClass().getName()), e);
                                }
                            }
                            applicationContext.registerComponentCallbacks(componentCallbacks2C3409b);
                            f9031i = componentCallbacks2C3409b;
                            f9032j = false;
                            return;
                        }
                        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                    }
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                }
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            } catch (PackageManager.NameNotFoundException e2) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e2);
            }
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    @NonNull
    /* renamed from: b */
    public static ComponentCallbacks2C3409b m6786b(@NonNull Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f9031i == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (ComponentCallbacks2C3409b.class) {
                if (f9031i == null) {
                    m6787a(context, generatedAppGlideModule);
                }
            }
        }
        return f9031i;
    }

    @NonNull
    /* renamed from: e */
    public static ComponentCallbacks2C3441l m6783e(@NonNull Context context) {
        if (context != null) {
            return m6786b(context).f9038f.m6487b(context);
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    /* renamed from: c */
    public final void m6785c(ComponentCallbacks2C3441l componentCallbacks2C3441l) {
        synchronized (this.f9040h) {
            if (this.f9040h.contains(componentCallbacks2C3441l)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.f9040h.add(componentCallbacks2C3441l);
        }
    }

    /* renamed from: d */
    public final void m6784d(ComponentCallbacks2C3441l componentCallbacks2C3441l) {
        synchronized (this.f9040h) {
            if (!this.f9040h.contains(componentCallbacks2C3441l)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f9040h.remove(componentCallbacks2C3441l);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        boolean z;
        char[] cArr = C3861k.f9956a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((C3856g) this.f9034b).m6408e(0L);
            this.f9033a.mo6694b();
            this.f9037e.mo6703b();
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        boolean z;
        char[] cArr = C3861k.f9956a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            synchronized (this.f9040h) {
                Iterator it = this.f9040h.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacks2C3441l) it.next()).getClass();
                }
            }
            ((C3516h) this.f9034b).m6672f(i);
            this.f9033a.mo6695a(i);
            this.f9037e.mo6704a(i);
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }
}
