package com.facebook.ads.redexgen.p036X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.2T */
/* loaded from: assets/audience_network.dex */
public final class C40582T {
    public static C40582T A05;
    public static byte[] A06;
    public static final Object A07;
    public final Context A00;
    public final Handler A01;
    public final HashMap<BroadcastReceiver, ArrayList<C40572S>> A04 = new HashMap<>();
    public final HashMap<String, ArrayList<C40572S>> A03 = new HashMap<>();
    public final ArrayList<C40562R> A02 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{-116, -116, -78, -43, -40, -32, -47, -34, -116, -48, -43, -48, -116, -38, -37, -32, -116, -39, -51, -32, -49, -44, -90, -116, -111, -111, -73, -38, -35, -27, -42, -29, -111, -34, -46, -27, -44, -39, -42, -43, -110, -111, -111, -34, -46, -27, -44, -39, -82, -95, -23, -102, -23, -32, -102, -29, -24, -18, -33, -24, -18, -102, 126, -47, -63, -58, -61, -53, -61, 126, -88, -54, -37, -48, -42, -43, -121, -45, -48, -38, -37, -95, -121, 27, 62, 50, 48, 59, 17, 65, 62, 48, 51, 50, 48, 66, 67, 28, 48, 61, 48, 54, 52, 65, -51, -31, -12, -29, -24, -23, -18, -25, -96, -31, -25, -31, -23, -18, -13, -12, -96, -26, -23, -20, -12, -27, -14, -96, -80, -61, -47, -51, -54, -44, -57, -52, -59, 126, -46, -41, -50, -61, 126, -19, -17, 0, -11, -5, -6, -3, -5, 14, -1, 1, 9, 12, 19, 9, 6, 25, 6, 29, 34, 25, 14, -53, -60, -63, -60, -59, -51, -60, 118, -56, -69, -73, -55, -59, -60};
    }

    static {
        A03();
        A07 = new Object();
    }

    public C40582T(Context context) {
        this.A00 = context;
        final Looper mainLooper = context.getMainLooper();
        this.A01 = new Handler(mainLooper) { // from class: com.facebook.ads.redexgen.X.2Q
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    C40582T.this.A02();
                }
            }
        };
    }

    public static C40582T A00(Context context) {
        C40582T c40582t;
        synchronized (A07) {
            if (A05 == null) {
                A05 = new C40582T(context.getApplicationContext());
            }
            c40582t = A05;
        }
        return c40582t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C40562R[] c40562rArr;
        while (true) {
            synchronized (this.A04) {
                int size = this.A02.size();
                if (size > 0) {
                    c40562rArr = new C40562R[size];
                    this.A02.toArray(c40562rArr);
                    this.A02.clear();
                } else {
                    return;
                }
            }
            for (C40562R c40562r : c40562rArr) {
                int size2 = c40562r.A01.size();
                for (int i = 0; i < size2; i++) {
                    C40572S c40572s = c40562r.A01.get(i);
                    if (!c40572s.A01) {
                        c40572s.A02.onReceive(this.A00, c40562r.A00);
                    }
                }
            }
        }
    }

    public final void A05(BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            ArrayList<C40572S> remove = this.A04.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                C40572S c40572s = remove.get(size);
                c40572s.A01 = true;
                for (int i = 0; i < c40572s.A03.countActions(); i++) {
                    String action = c40572s.A03.getAction(i);
                    ArrayList<C40572S> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            C40572S c40572s2 = arrayList.get(size2);
                            if (c40572s2.A02 == broadcastReceiver) {
                                c40572s2.A01 = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A06(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.A04) {
            C40572S c40572s = new C40572S(intentFilter, broadcastReceiver);
            ArrayList<C40572S> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c40572s);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<C40572S> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(c40572s);
            }
        }
    }

    public final boolean A07(Intent intent) {
        String str;
        String A01;
        synchronized (this.A04) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            int i = 0;
            int i2 = (intent.getFlags() & 8) != 0 ? 1 : 0;
            if (i2 != 0) {
                String str2 = A01(128, 15, 14) + resolveTypeIfNeeded + A01(62, 8, 14) + scheme + A01(51, 11, 42) + intent;
            }
            ArrayList<C40572S> arrayList = this.A03.get(intent.getAction());
            if (arrayList != null) {
                if (i2 != 0) {
                    String str3 = A01(70, 13, 23) + arrayList;
                }
                ArrayList arrayList2 = null;
                while (i < arrayList.size()) {
                    C40572S c40572s = arrayList.get(i);
                    if (i2 != 0) {
                        String str4 = A01(104, 24, 48) + c40572s.A03;
                    }
                    if (!c40572s.A00) {
                        str = resolveTypeIfNeeded;
                        int match = c40572s.A03.match(action, resolveTypeIfNeeded, scheme, data, categories, A01(83, 21, 127));
                        if (match >= 0) {
                            if (i2 != 0) {
                                String str5 = A01(24, 27, 33) + Integer.toHexString(match);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c40572s);
                            c40572s.A00 = true;
                        } else if (i2 != 0) {
                            if (match == -4) {
                                A01 = A01(149, 8, 74);
                            } else if (match == -3) {
                                A01 = A01(143, 6, 60);
                            } else if (match == -2) {
                                A01 = A01(157, 4, 85);
                            } else if (match != -1) {
                                A01 = A01(165, 14, 6);
                            } else {
                                A01 = A01(161, 4, 89);
                            }
                            String str6 = A01(0, 24, 28) + A01;
                        }
                    } else if (i2 != 0) {
                        str = resolveTypeIfNeeded;
                    } else {
                        str = resolveTypeIfNeeded;
                    }
                    i++;
                    resolveTypeIfNeeded = str;
                }
                if (arrayList2 != null) {
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        ((C40572S) arrayList2.get(i3)).A00 = false;
                    }
                    this.A02.add(new C40562R(intent, arrayList2));
                    if (!this.A01.hasMessages(1)) {
                        this.A01.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
