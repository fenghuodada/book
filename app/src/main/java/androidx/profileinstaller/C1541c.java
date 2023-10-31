package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.profileinstaller.ProfileInstaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.Executor;

@RequiresApi(19)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* renamed from: androidx.profileinstaller.c */
/* loaded from: classes.dex */
public final class C1541c {
    @NonNull

    /* renamed from: a */
    public final Executor f3542a;
    @NonNull

    /* renamed from: b */
    public final ProfileInstaller.InterfaceC1533c f3543b;
    @Nullable

    /* renamed from: c */
    public final byte[] f3544c;
    @NonNull

    /* renamed from: d */
    public final File f3545d;
    @NonNull

    /* renamed from: e */
    public final String f3546e;

    /* renamed from: f */
    public boolean f3547f = false;
    @Nullable

    /* renamed from: g */
    public C1542d[] f3548g;
    @Nullable

    /* renamed from: h */
    public byte[] f3549h;

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    public C1541c(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull ProfileInstaller.InterfaceC1533c interfaceC1533c, @NonNull String str, @NonNull File file) {
        byte[] bArr;
        this.f3542a = executor;
        this.f3543b = interfaceC1533c;
        this.f3546e = str;
        this.f3545d = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24 && i <= 33) {
            switch (i) {
                case 24:
                case 25:
                    bArr = C1551m.f3570e;
                    break;
                case 26:
                    bArr = C1551m.f3569d;
                    break;
                case 27:
                    bArr = C1551m.f3568c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = C1551m.f3567b;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = C1551m.f3566a;
                    break;
            }
            this.f3544c = bArr;
        }
        bArr = null;
        this.f3544c = bArr;
    }

    @Nullable
    /* renamed from: a */
    public final FileInputStream m10480a(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f3543b.mo10490a();
            }
            return null;
        }
    }

    /* renamed from: b */
    public final void m10479b(final int i, @Nullable final Serializable serializable) {
        this.f3542a.execute(new Runnable() { // from class: androidx.profileinstaller.b
            @Override // java.lang.Runnable
            public final void run() {
                C1541c.this.f3543b.mo10489b(i, serializable);
            }
        });
    }
}
