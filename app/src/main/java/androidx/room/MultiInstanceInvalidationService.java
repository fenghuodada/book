package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.HashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: a */
    public int f4014a = 0;

    /* renamed from: b */
    public final HashMap<Integer, String> f4015b = new HashMap<>();

    /* renamed from: c */
    public final RemoteCallbackListC1654a f4016c = new RemoteCallbackListC1654a();

    /* renamed from: d */
    public final BinderC1655b f4017d = new BinderC1655b();

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    /* loaded from: classes.dex */
    public class RemoteCallbackListC1654a extends RemoteCallbackList<InterfaceC1661f> {
        public RemoteCallbackListC1654a() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(InterfaceC1661f interfaceC1661f, Object obj) {
            MultiInstanceInvalidationService.this.f4015b.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    /* loaded from: classes.dex */
    public class BinderC1655b extends AbstractBinderC1662g {
        public BinderC1655b() {
        }

        /* renamed from: d */
        public final void m10087d(String[] strArr, int i) {
            synchronized (MultiInstanceInvalidationService.this.f4016c) {
                String str = MultiInstanceInvalidationService.this.f4015b.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f4016c.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.f4016c.getBroadcastCookie(i2)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.f4015b.get(Integer.valueOf(intValue));
                    if (i != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.f4016c.getBroadcastItem(i2).mo10083a(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                }
                MultiInstanceInvalidationService.this.f4016c.finishBroadcast();
            }
        }

        /* renamed from: e */
        public final int m10086e(InterfaceC1661f interfaceC1661f, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f4016c) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f4014a + 1;
                multiInstanceInvalidationService.f4014a = i;
                if (multiInstanceInvalidationService.f4016c.register(interfaceC1661f, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f4015b.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f4014a--;
                return 0;
            }
        }
    }

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent) {
        return this.f4017d;
    }
}
