package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.AbstractC1802a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1802a abstractC1802a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f2254a;
        if (abstractC1802a.mo9924h(1)) {
            obj = abstractC1802a.m9931n();
        }
        remoteActionCompat.f2254a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f2255b;
        if (abstractC1802a.mo9924h(2)) {
            charSequence = abstractC1802a.mo9925g();
        }
        remoteActionCompat.f2255b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f2256c;
        if (abstractC1802a.mo9924h(3)) {
            charSequence2 = abstractC1802a.mo9925g();
        }
        remoteActionCompat.f2256c = charSequence2;
        remoteActionCompat.f2257d = (PendingIntent) abstractC1802a.m9932l(remoteActionCompat.f2257d, 4);
        boolean z = remoteActionCompat.f2258e;
        if (abstractC1802a.mo9924h(5)) {
            z = abstractC1802a.mo9927e();
        }
        remoteActionCompat.f2258e = z;
        boolean z2 = remoteActionCompat.f2259f;
        if (abstractC1802a.mo9924h(6)) {
            z2 = abstractC1802a.mo9927e();
        }
        remoteActionCompat.f2259f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1802a abstractC1802a) {
        abstractC1802a.getClass();
        IconCompat iconCompat = remoteActionCompat.f2254a;
        abstractC1802a.mo9920o(1);
        abstractC1802a.m9929w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f2255b;
        abstractC1802a.mo9920o(2);
        abstractC1802a.mo9917r(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f2256c;
        abstractC1802a.mo9920o(3);
        abstractC1802a.mo9917r(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f2257d;
        abstractC1802a.mo9920o(4);
        abstractC1802a.mo9915u(pendingIntent);
        boolean z = remoteActionCompat.f2258e;
        abstractC1802a.mo9920o(5);
        abstractC1802a.mo9919p(z);
        boolean z2 = remoteActionCompat.f2259f;
        abstractC1802a.mo9920o(6);
        abstractC1802a.mo9919p(z2);
    }
}
