package androidx.appcompat.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.AdRequest;

/* renamed from: androidx.appcompat.app.x */
/* loaded from: classes.dex */
public final class ServiceC0150x extends Service {

    /* renamed from: a */
    public static final /* synthetic */ int f400a = 0;

    @RequiresApi(24)
    /* renamed from: androidx.appcompat.app.x$a */
    /* loaded from: classes.dex */
    public static class C0151a {
        @DoNotInline
        /* renamed from: a */
        public static int m12928a() {
            return AdRequest.MAX_CONTENT_URL_LENGTH;
        }
    }

    @Override // android.app.Service
    @NonNull
    public final IBinder onBind(@NonNull Intent intent) {
        throw new UnsupportedOperationException();
    }
}
