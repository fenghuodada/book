package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: androidx.localbroadcastmanager.content.a */
/* loaded from: classes.dex */
public final class C1520a {

    /* renamed from: f */
    public static final Object f3496f = new Object();

    /* renamed from: g */
    public static C1520a f3497g;

    /* renamed from: a */
    public final Context f3498a;

    /* renamed from: b */
    public final HashMap<BroadcastReceiver, ArrayList<C1523c>> f3499b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, ArrayList<C1523c>> f3500c = new HashMap<>();

    /* renamed from: d */
    public final ArrayList<C1522b> f3501d = new ArrayList<>();

    /* renamed from: e */
    public final HandlerC1521a f3502e;

    /* renamed from: androidx.localbroadcastmanager.content.a$a */
    /* loaded from: classes.dex */
    public class HandlerC1521a extends Handler {
        public HandlerC1521a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int size;
            C1522b[] c1522bArr;
            if (message.what != 1) {
                super.handleMessage(message);
                return;
            }
            C1520a c1520a = C1520a.this;
            while (true) {
                synchronized (c1520a.f3499b) {
                    size = c1520a.f3501d.size();
                    if (size <= 0) {
                        return;
                    }
                    c1522bArr = new C1522b[size];
                    c1520a.f3501d.toArray(c1522bArr);
                    c1520a.f3501d.clear();
                }
                for (int i = 0; i < size; i++) {
                    C1522b c1522b = c1522bArr[i];
                    int size2 = c1522b.f3505b.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        C1523c c1523c = c1522b.f3505b.get(i2);
                        if (!c1523c.f3509d) {
                            c1523c.f3507b.onReceive(c1520a.f3498a, c1522b.f3504a);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: androidx.localbroadcastmanager.content.a$b */
    /* loaded from: classes.dex */
    public static final class C1522b {

        /* renamed from: a */
        public final Intent f3504a;

        /* renamed from: b */
        public final ArrayList<C1523c> f3505b;

        public C1522b(Intent intent, ArrayList<C1523c> arrayList) {
            this.f3504a = intent;
            this.f3505b = arrayList;
        }
    }

    /* renamed from: androidx.localbroadcastmanager.content.a$c */
    /* loaded from: classes.dex */
    public static final class C1523c {

        /* renamed from: a */
        public final IntentFilter f3506a;

        /* renamed from: b */
        public final BroadcastReceiver f3507b;

        /* renamed from: c */
        public boolean f3508c;

        /* renamed from: d */
        public boolean f3509d;

        public C1523c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            this.f3506a = intentFilter;
            this.f3507b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f3507b);
            sb.append(" filter=");
            sb.append(this.f3506a);
            if (this.f3509d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public C1520a(Context context) {
        this.f3498a = context;
        this.f3502e = new HandlerC1521a(context.getMainLooper());
    }

    @NonNull
    /* renamed from: a */
    public static C1520a m10509a(@NonNull Context context) {
        C1520a c1520a;
        synchronized (f3496f) {
            if (f3497g == null) {
                f3497g = new C1520a(context.getApplicationContext());
            }
            c1520a = f3497g;
        }
        return c1520a;
    }

    /* renamed from: b */
    public final void m10508b(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.f3499b) {
            C1523c c1523c = new C1523c(broadcastReceiver, intentFilter);
            ArrayList<C1523c> arrayList = this.f3499b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f3499b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c1523c);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<C1523c> arrayList2 = this.f3500c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f3500c.put(action, arrayList2);
                }
                arrayList2.add(c1523c);
            }
        }
    }

    /* renamed from: c */
    public final void m10507c(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.f3499b) {
            ArrayList<C1523c> remove = this.f3499b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                C1523c c1523c = remove.get(size);
                c1523c.f3509d = true;
                for (int i = 0; i < c1523c.f3506a.countActions(); i++) {
                    String action = c1523c.f3506a.getAction(i);
                    ArrayList<C1523c> arrayList = this.f3500c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            C1523c c1523c2 = arrayList.get(size2);
                            if (c1523c2.f3507b == broadcastReceiver) {
                                c1523c2.f3509d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f3500c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
