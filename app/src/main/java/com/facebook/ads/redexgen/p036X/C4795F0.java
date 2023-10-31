package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.F0 */
/* loaded from: assets/audience_network.dex */
public final class C4795F0 {
    public static byte[] A0F;
    public static String[] A0G = {"8avf0Jibg", "29lNoiTUBE2uYEjX9VQOmTXDz5OY", "iVCyimFGxTrkRtFibV9levDJM5ZeLgZu", "gsRFpTOWHqJbEx7", "Kz1bOIham", "JnXM2eLoSoNer4vADvBB94foIijHhZU8", "txozpLaaBXvdIU5pC59NuAEDTSpBHfjF", "fwU5WNlYuxW7JC9kmXc8msxXEM9ymJ0s"};
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Handler A06;
    public final Handler A07;
    public final HandlerThread A08;
    public final C4777Eg A09;
    public final C4800F5 A0A;
    public final ArrayList<RunnableC4792Ex> A0B;
    public final ArrayList<RunnableC4792Ex> A0C;
    public final CopyOnWriteArraySet<InterfaceC4788Et> A0D;
    public final DownloadAction.Deserializer[] A0E;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0G[7].charAt(18) == 'd') {
                throw new RuntimeException();
            }
            A0G[5] = "QeXCOK5E1pPej2TxlzyNK8QEELc16ejC";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 103);
            i4++;
        }
    }

    public static void A0C() {
        A0F = new byte[]{40, 107, 100, 105, 123, 96, 109, 123, 40, Byte.MAX_VALUE, 97, 124, 96, 40, 13, 23, 101, 80, 4, 72, 65, 69, 87, 80, 4, 75, 74, 65, 4, 96, 65, 87, 65, 86, 77, 69, 72, 77, 94, 65, 86, 4, 77, 87, 4, 86, 65, 85, 81, 77, 86, 65, 64, 10, 82, 121, 97, 120, 122, 121, 119, 114, 91, 119, 120, 119, 113, 115, 100, 54, 112, Byte.MAX_VALUE, 122, 115, 54, Byte.MAX_VALUE, 57, 121, 37, 16, 2, 26, 81, 24, 2, 81, 16, 21, 21, 20, 21, 21, 32, 50, 42, 97, 50, 53, 32, 53, 36, 97, 40, 50, 97, 34, 41, 32, 47, 38, 36, 37};
    }

    static {
        A0C();
    }

    public C4795F0(C4800F5 c4800f5, int i, int i2, File file, DownloadAction.Deserializer... deserializerArr) {
        C4997IK.A05(deserializerArr.length > 0, A05(16, 38, 67));
        this.A0A = c4800f5;
        this.A04 = i;
        this.A05 = i2;
        this.A09 = new C4777Eg(file);
        this.A0E = deserializerArr;
        this.A01 = true;
        this.A0C = new ArrayList<>();
        this.A0B = new ArrayList<>();
        Looper myLooper = Looper.myLooper();
        this.A07 = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        this.A08 = new HandlerThread(A05(54, 24, 113));
        this.A08.start();
        this.A06 = new Handler(this.A08.getLooper());
        this.A0D = new CopyOnWriteArraySet<>();
        A08();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RunnableC4792Ex A02(DownloadAction downloadAction) {
        int i = this.A00;
        this.A00 = i + 1;
        RunnableC4792Ex runnableC4792Ex = new RunnableC4792Ex(i, this, downloadAction, this.A05, null);
        this.A0C.add(runnableC4792Ex);
        A0J(A05(78, 13, 22), runnableC4792Ex);
        return runnableC4792Ex;
    }

    private void A08() {
        this.A06.post(new RunnableC4786Er(this));
    }

    private void A09() {
        if (!A0R()) {
            return;
        }
        Iterator<InterfaceC4788Et> it = this.A0D.iterator();
        while (it.hasNext()) {
            InterfaceC4788Et listener = it.next();
            listener.AAw(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        DownloadAction A06;
        boolean z;
        if (!this.A02 || this.A03) {
            return;
        }
        boolean canStartTask = this.A01 || this.A0B.size() == this.A04;
        for (int j = 0; j < this.A0C.size(); j++) {
            RunnableC4792Ex runnableC4792Ex = this.A0C.get(j);
            if (RunnableC4792Ex.A0H(runnableC4792Ex) && ((z = (A06 = RunnableC4792Ex.A06(runnableC4792Ex)).A03) || !canStartTask)) {
                boolean z2 = true;
                int i = 0;
                while (true) {
                    if (i >= j) {
                        break;
                    }
                    RunnableC4792Ex runnableC4792Ex2 = this.A0C.get(i);
                    DownloadAction action = RunnableC4792Ex.A06(runnableC4792Ex2);
                    if (action.A09(A06)) {
                        if (z) {
                            z2 = false;
                            String str = runnableC4792Ex + A05(0, 14, 111) + runnableC4792Ex2;
                            RunnableC4792Ex.A0C(runnableC4792Ex2);
                        } else if (RunnableC4792Ex.A06(runnableC4792Ex2).A03) {
                            z2 = false;
                            canStartTask = true;
                            break;
                        }
                    }
                    i++;
                }
                if (z2) {
                    RunnableC4792Ex.A0D(runnableC4792Ex);
                    if (!z) {
                        this.A0B.add(runnableC4792Ex);
                        canStartTask = this.A0B.size() == this.A04;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0014 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0B() {
        /*
            r3 = this;
            boolean r0 = r3.A03
            if (r0 == 0) goto L5
            return
        L5:
            java.util.ArrayList<com.facebook.ads.redexgen.X.Ex> r0 = r3.A0C
            int r0 = r0.size()
            com.facebook.ads.internal.exoplayer2.offline.DownloadAction[] r2 = new com.facebook.ads.internal.exoplayer2.offline.DownloadAction[r0]
            r1 = 0
        Le:
            java.util.ArrayList<com.facebook.ads.redexgen.X.Ex> r0 = r3.A0C
            int r0 = r0.size()
            if (r1 >= r0) goto L27
            java.util.ArrayList<com.facebook.ads.redexgen.X.Ex> r0 = r3.A0C
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ads.redexgen.X.Ex r0 = (com.facebook.ads.redexgen.p036X.RunnableC4792Ex) r0
            com.facebook.ads.internal.exoplayer2.offline.DownloadAction r0 = com.facebook.ads.redexgen.p036X.RunnableC4792Ex.A06(r0)
            r2[r1] = r0
            int r1 = r1 + 1
            goto Le
        L27:
            android.os.Handler r1 = r3.A06
            com.facebook.ads.redexgen.X.Es r0 = new com.facebook.ads.redexgen.X.Es
            r0.<init>(r3, r2)
            r1.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4795F0.A0B():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(RunnableC4792Ex runnableC4792Ex) {
        A0J(A05(91, 21, 38), runnableC4792Ex);
        C4794Ez A0K = runnableC4792Ex.A0K();
        Iterator<InterfaceC4788Et> it = this.A0D.iterator();
        while (it.hasNext()) {
            it.next().ACV(this, A0K);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(RunnableC4792Ex runnableC4792Ex) {
        if (this.A03) {
            return;
        }
        boolean A0L = runnableC4792Ex.A0L();
        String[] strArr = A0G;
        if (strArr[2].charAt(18) != strArr[6].charAt(18)) {
            throw new RuntimeException();
        }
        A0G[5] = "MuXE9yewg4GnYpwcSobAkjsL3VeJsTJN";
        boolean z = !A0L;
        if (z) {
            this.A0B.remove(runnableC4792Ex);
        }
        A0D(runnableC4792Ex);
        if (runnableC4792Ex.A0M()) {
            this.A0C.remove(runnableC4792Ex);
            A0B();
        }
        if (z) {
            A0A();
            A09();
        }
    }

    public static void A0J(String str, RunnableC4792Ex runnableC4792Ex) {
        String str2 = str + A05(14, 2, 80) + runnableC4792Ex;
    }

    public final int A0O(DownloadAction downloadAction) {
        C4997IK.A04(!this.A03);
        RunnableC4792Ex A02 = A02(downloadAction);
        if (this.A02) {
            A0B();
            A0A();
            if (RunnableC4792Ex.A03(A02) == 0) {
                A0D(A02);
            }
        }
        return RunnableC4792Ex.A04(A02);
    }

    public final void A0P() {
        C4997IK.A04(!this.A03);
        if (this.A01) {
            this.A01 = false;
            A0A();
        }
    }

    public final void A0Q(InterfaceC4788Et interfaceC4788Et) {
        this.A0D.add(interfaceC4788Et);
    }

    public final boolean A0R() {
        C4997IK.A04(!this.A03);
        if (this.A02) {
            for (int i = 0; i < this.A0C.size(); i++) {
                if (this.A0C.get(i).A0L()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0011 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.p036X.C4794Ez[] A0S() {
        /*
            r3 = this;
            boolean r0 = r3.A03
            r0 = r0 ^ 1
            com.facebook.ads.redexgen.p036X.C4997IK.A04(r0)
            java.util.ArrayList<com.facebook.ads.redexgen.X.Ex> r0 = r3.A0C
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.Ez[] r2 = new com.facebook.ads.redexgen.p036X.C4794Ez[r0]
            r1 = 0
        L10:
            int r0 = r2.length
            if (r1 >= r0) goto L24
            java.util.ArrayList<com.facebook.ads.redexgen.X.Ex> r0 = r3.A0C
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ads.redexgen.X.Ex r0 = (com.facebook.ads.redexgen.p036X.RunnableC4792Ex) r0
            com.facebook.ads.redexgen.X.Ez r0 = r0.A0K()
            r2[r1] = r0
            int r1 = r1 + 1
            goto L10
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4795F0.A0S():com.facebook.ads.redexgen.X.Ez[]");
    }
}
