package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.datastore.preferences.protobuf.C1155a1;
import com.bumptech.glide.EnumC3432i;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.data.InterfaceC3452d;
import com.bumptech.glide.load.model.C3635s;
import com.bumptech.glide.load.model.InterfaceC3627o;
import com.bumptech.glide.load.model.InterfaceC3629p;
import com.bumptech.glide.signature.C3845b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RequiresApi(29)
/* renamed from: com.bumptech.glide.load.model.stream.d */
/* loaded from: classes.dex */
public final class C3645d<DataT> implements InterfaceC3627o<Uri, DataT> {

    /* renamed from: a */
    public final Context f9597a;

    /* renamed from: b */
    public final InterfaceC3627o<File, DataT> f9598b;

    /* renamed from: c */
    public final InterfaceC3627o<Uri, DataT> f9599c;

    /* renamed from: d */
    public final Class<DataT> f9600d;

    /* renamed from: com.bumptech.glide.load.model.stream.d$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3646a<DataT> implements InterfaceC3629p<Uri, DataT> {

        /* renamed from: a */
        public final Context f9601a;

        /* renamed from: b */
        public final Class<DataT> f9602b;

        public AbstractC3646a(Context context, Class<DataT> cls) {
            this.f9601a = context;
            this.f9602b = cls;
        }

        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<Uri, DataT> mo6572b(@NonNull C3635s c3635s) {
            Class<DataT> cls = this.f9602b;
            return new C3645d(this.f9601a, c3635s.m6585c(File.class, cls), c3635s.m6585c(Uri.class, cls), cls);
        }
    }

    @RequiresApi(29)
    /* renamed from: com.bumptech.glide.load.model.stream.d$b */
    /* loaded from: classes.dex */
    public static final class C3647b extends AbstractC3646a<ParcelFileDescriptor> {
        public C3647b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    @RequiresApi(29)
    /* renamed from: com.bumptech.glide.load.model.stream.d$c */
    /* loaded from: classes.dex */
    public static final class C3648c extends AbstractC3646a<InputStream> {
        public C3648c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.stream.d$d */
    /* loaded from: classes.dex */
    public static final class C3649d<DataT> implements InterfaceC3452d<DataT> {

        /* renamed from: k */
        public static final String[] f9603k = {"_data"};

        /* renamed from: a */
        public final Context f9604a;

        /* renamed from: b */
        public final InterfaceC3627o<File, DataT> f9605b;

        /* renamed from: c */
        public final InterfaceC3627o<Uri, DataT> f9606c;

        /* renamed from: d */
        public final Uri f9607d;

        /* renamed from: e */
        public final int f9608e;

        /* renamed from: f */
        public final int f9609f;

        /* renamed from: g */
        public final C3581i f9610g;

        /* renamed from: h */
        public final Class<DataT> f9611h;

        /* renamed from: i */
        public volatile boolean f9612i;
        @Nullable

        /* renamed from: j */
        public volatile InterfaceC3452d<DataT> f9613j;

        public C3649d(Context context, InterfaceC3627o<File, DataT> interfaceC3627o, InterfaceC3627o<Uri, DataT> interfaceC3627o2, Uri uri, int i, int i2, C3581i c3581i, Class<DataT> cls) {
            this.f9604a = context.getApplicationContext();
            this.f9605b = interfaceC3627o;
            this.f9606c = interfaceC3627o2;
            this.f9607d = uri;
            this.f9608e = i;
            this.f9609f = i2;
            this.f9610g = c3581i;
            this.f9611h = cls;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        @NonNull
        /* renamed from: a */
        public final Class<DataT> mo6579a() {
            return this.f9611h;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        /* renamed from: b */
        public final void mo6578b() {
            InterfaceC3452d<DataT> interfaceC3452d = this.f9613j;
            if (interfaceC3452d != null) {
                interfaceC3452d.mo6578b();
            }
        }

        @Nullable
        /* renamed from: c */
        public final InterfaceC3452d<DataT> m6582c() throws FileNotFoundException {
            boolean isExternalStorageLegacy;
            boolean z;
            InterfaceC3627o.C3628a<DataT> mo6573b;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            C3581i c3581i = this.f9610g;
            int i = this.f9609f;
            int i2 = this.f9608e;
            Context context = this.f9604a;
            if (isExternalStorageLegacy) {
                Uri uri = this.f9607d;
                try {
                    Cursor query = context.getContentResolver().query(uri, f9603k, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (!TextUtils.isEmpty(string)) {
                                    File file = new File(string);
                                    query.close();
                                    mo6573b = this.f9605b.mo6573b(file, i2, i, c3581i);
                                } else {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    z = true;
                } else {
                    z = false;
                }
                Uri uri2 = this.f9607d;
                if (z) {
                    uri2 = MediaStore.setRequireOriginal(uri2);
                }
                mo6573b = this.f9606c.mo6573b(uri2, i2, i, c3581i);
            }
            if (mo6573b == null) {
                return null;
            }
            return mo6573b.f9567c;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        public final void cancel() {
            this.f9612i = true;
            InterfaceC3452d<DataT> interfaceC3452d = this.f9613j;
            if (interfaceC3452d != null) {
                interfaceC3452d.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        @NonNull
        /* renamed from: d */
        public final EnumC3444a mo6577d() {
            return EnumC3444a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC3452d
        /* renamed from: e */
        public final void mo6576e(@NonNull EnumC3432i enumC3432i, @NonNull InterfaceC3452d.InterfaceC3453a<? super DataT> interfaceC3453a) {
            try {
                InterfaceC3452d<DataT> m6582c = m6582c();
                if (m6582c == null) {
                    interfaceC3453a.mo6590c(new IllegalArgumentException("Failed to build fetcher for: " + this.f9607d));
                    return;
                }
                this.f9613j = m6582c;
                if (this.f9612i) {
                    cancel();
                } else {
                    m6582c.mo6576e(enumC3432i, interfaceC3453a);
                }
            } catch (FileNotFoundException e) {
                interfaceC3453a.mo6590c(e);
            }
        }
    }

    public C3645d(Context context, InterfaceC3627o<File, DataT> interfaceC3627o, InterfaceC3627o<Uri, DataT> interfaceC3627o2, Class<DataT> cls) {
        this.f9597a = context.getApplicationContext();
        this.f9598b = interfaceC3627o;
        this.f9599c = interfaceC3627o2;
        this.f9600d = cls;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: a */
    public final boolean mo6574a(@NonNull Uri uri) {
        Uri uri2 = uri;
        if (Build.VERSION.SDK_INT >= 29 && C1155a1.m11147a(uri2)) {
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: b */
    public final InterfaceC3627o.C3628a mo6573b(@NonNull Uri uri, int i, int i2, @NonNull C3581i c3581i) {
        Uri uri2 = uri;
        return new InterfaceC3627o.C3628a(new C3845b(uri2), new C3649d(this.f9597a, this.f9598b, this.f9599c, uri2, i, i2, c3581i, this.f9600d));
    }
}
