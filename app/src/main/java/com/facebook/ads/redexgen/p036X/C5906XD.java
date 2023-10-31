package com.facebook.ads.redexgen.p036X;

import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.XD */
/* loaded from: assets/audience_network.dex */
public final class C5906XD implements InterfaceC4552Ak, InterfaceC4754EJ, InterfaceC4597BT, InterfaceC5060JN, InterfaceC4845Fo, InterfaceC4949HY, InterfaceC4640CA {
    public static String[] A05 = {"oWxliEG", "84CCzfJSWHAMzlT", "dVPYU5AFfnLld9", "202VfNqPV04zLFr42xUQnFXcv", "6C2OHs0d6U2aNpx0mThNdUqCMJf7H", "j36hHuSQknS9Y2BeP2DWP06EygcBzL55", "WN9koNHhTr4SbLKtJDKTY2JTPC", "f2Eog"};
    public InterfaceC4557Ap A00;
    public final InterfaceC5000IN A03;
    public final CopyOnWriteArraySet<InterfaceC4574B6> A04 = new CopyOnWriteArraySet<>();
    public final C4571B3 A02 = new C4571B3();
    public final C4568B0 A01 = new C4568B0();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4949HY
    public final void AAB(int i, long j, long j2) {
        A01();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public C5906XD(@Nullable InterfaceC4557Ap interfaceC4557Ap, InterfaceC5000IN interfaceC5000IN) {
        this.A00 = interfaceC4557Ap;
        this.A03 = (InterfaceC5000IN) C4997IK.A01(interfaceC5000IN);
    }

    private C4573B5 A00() {
        return A05(this.A02.A03());
    }

    private C4573B5 A01() {
        return A05(this.A02.A04());
    }

    private C4573B5 A02() {
        return A05(this.A02.A05());
    }

    private C4573B5 A03() {
        return A05(this.A02.A06());
    }

    private final C4573B5 A04(int i, @Nullable C4829FY c4829fy) {
        long j;
        C4997IK.A01(this.A00);
        long A58 = this.A03.A58();
        AbstractC4569B1 timeline = this.A00.A6H();
        if (i == this.A00.A6I()) {
            if (c4829fy != null && c4829fy.A01()) {
                if (this.A00.A6C() == c4829fy.A00 && this.A00.A6D() == c4829fy.A01) {
                    j = this.A00.A6F();
                } else {
                    j = 0;
                }
            } else {
                j = this.A00.A6A();
            }
        } else if (i >= timeline.A01() || (c4829fy != null && c4829fy.A01())) {
            j = 0;
        } else {
            j = timeline.A0B(i, this.A01).A00();
        }
        return new C4573B5(A58, timeline, i, c4829fy, j, this.A00.A6F(), this.A00.A5s() - this.A00.A6A());
    }

    private C4573B5 A05(@Nullable C4572B4 c4572b4) {
        if (c4572b4 == null) {
            int A6I = ((InterfaceC4557Ap) C4997IK.A01(this.A00)).A6I();
            return A04(A6I, this.A02.A07(A6I));
        }
        return A04(c4572b4.A00, c4572b4.A01);
    }

    public final void A06() {
        if (!this.A02.A0F()) {
            C4573B5 A02 = A02();
            this.A02.A09();
            Iterator<InterfaceC4574B6> it = this.A04.iterator();
            while (it.hasNext()) {
                InterfaceC4574B6 next = it.next();
                String[] strArr = A05;
                if (strArr[1].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[1] = "PBkwxeOlbvYzAOz";
                strArr2[4] = "zMCnce58Qhbdr93RoMzV7EOLVlkYq";
                next.onSeekStarted(A02);
            }
        }
    }

    public final void A07() {
        ArrayList arrayList;
        arrayList = this.A02.A05;
        Iterator it = new ArrayList(arrayList).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A05[0] = "gG2PlvUwOW39eC8R";
            if (hasNext) {
                C4572B4 c4572b4 = (C4572B4) it.next();
                ABV(c4572b4.A00, c4572b4.A01);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4597BT
    public final void AA4(String str, long j, long j2) {
        C4573B5 eventTime = A03();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(eventTime, 1, str, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4597BT
    public final void AA5(C4626Bw c4626Bw) {
        C4573B5 A00 = A00();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(A00, 1, c4626Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4597BT
    public final void AA6(C4626Bw c4626Bw) {
        C4573B5 A02 = A02();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(A02, 1, c4626Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4597BT
    public final void AA7(Format format) {
        C4573B5 A03 = A03();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(A03, 1, format);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4597BT
    public final void AA8(int i) {
        C4573B5 A03 = A03();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onAudioSessionId(A03, i);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4597BT
    public final void AA9(int i, long j, long j2) {
        C4573B5 A03 = A03();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A05[2].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[1] = "uqo4gq1KBxiMktN";
            strArr[4] = "Ndm2ibG2UK8Su1apjnSt0jhcojAUZ";
            if (hasNext) {
                it.next().onAudioUnderrun(A03, i, j, j2);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4845Fo
    public final void AAZ(int i, @Nullable C4829FY c4829fy, C4844Fn c4844Fn) {
        C4573B5 A04 = A04(i, c4829fy);
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDownstreamFormatChanged(A04, c4844Fn);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4640CA
    public final void AAa() {
        C4573B5 A03 = A03();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            InterfaceC4574B6 listener = it.next();
            listener.onDrmKeysLoaded(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4640CA
    public final void AAb() {
        C4573B5 A03 = A03();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            InterfaceC4574B6 listener = it.next();
            listener.onDrmKeysRemoved(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4640CA
    public final void AAc() {
        C4573B5 A03 = A03();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            InterfaceC4574B6 listener = it.next();
            listener.onDrmKeysRestored(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4640CA
    public final void AAd(Exception exc) {
        C4573B5 A03 = A03();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDrmSessionManagerError(A03, exc);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5060JN
    public final void AAe(int i, long j) {
        C4573B5 A00 = A00();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDroppedVideoFrames(A00, i, j);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4845Fo
    public final void ABE(int i, @Nullable C4829FY c4829fy, C4843Fm c4843Fm, C4844Fn c4844Fn) {
        A04(i, c4829fy);
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4845Fo
    public final void ABG(int i, @Nullable C4829FY c4829fy, C4843Fm c4843Fm, C4844Fn c4844Fn) {
        A04(i, c4829fy);
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4845Fo
    public final void ABJ(int i, @Nullable C4829FY c4829fy, C4843Fm c4843Fm, C4844Fn c4844Fn, IOException iOException, boolean z) {
        C4573B5 A04 = A04(i, c4829fy);
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onLoadError(A04, c4843Fm, c4844Fn, iOException, z);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4845Fo
    public final void ABL(int i, @Nullable C4829FY c4829fy, C4843Fm c4843Fm, C4844Fn c4844Fn) {
        A04(i, c4829fy);
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4552Ak
    public final void ABN(boolean z) {
        C4573B5 A02 = A02();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            InterfaceC4574B6 next = it.next();
            if (A05[2].length() == 13) {
                throw new RuntimeException();
            }
            A05[5] = "61iKEbH7Elk598B8IvoVeyiFcghmzjBq";
            next.onLoadingChanged(A02, z);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4845Fo
    public final void ABU(int i, C4829FY c4829fy) {
        this.A02.A0B(i, c4829fy);
        C4573B5 A04 = A04(i, c4829fy);
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMediaPeriodCreated(A04);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4845Fo
    public final void ABV(int i, C4829FY c4829fy) {
        this.A02.A0C(i, c4829fy);
        C4573B5 A04 = A04(i, c4829fy);
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[1] = "xQuAJnMHmsnkUtn";
            strArr2[4] = "I7nuhInD03G6TyFgZN1tEp7XA66Po";
            if (hasNext) {
                it.next().onMediaPeriodReleased(A04);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4754EJ
    public final void ABY(Metadata metadata) {
        C4573B5 A02 = A02();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMetadata(A02, metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4552Ak
    public final void ABo(C4549Ah c4549Ah) {
        C4573B5 A02 = A02();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            InterfaceC4574B6 next = it.next();
            if (A05[5].charAt(25) != 'g') {
                throw new RuntimeException();
            }
            A05[5] = "6kCd761y4Sm0JC2HIy7vlDu4Zge9adCZ";
            next.onPlaybackParametersChanged(A02, c4549Ah);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4552Ak
    public final void ABq(C4529AM c4529am) {
        C4573B5 A02 = A02();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            InterfaceC4574B6 next = it.next();
            String[] strArr = A05;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A05[3] = "4uLQlqFUz3TKu9PUP8Ua0";
            next.onPlayerError(A02, c4529am);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4552Ak
    public final void ABs(boolean z, int i) {
        C4573B5 A02 = A02();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onPlayerStateChanged(A02, z, i);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4552Ak
    public final void ABu(int i) {
        this.A02.A0A(i);
        C4573B5 A02 = A02();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            InterfaceC4574B6 listener = it.next();
            listener.onPositionDiscontinuity(A02, i);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4845Fo
    public final void AC3(int i, C4829FY c4829fy) {
        this.A02.A0D(i, c4829fy);
        C4573B5 A04 = A04(i, c4829fy);
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onReadingStarted(A04);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5060JN
    public final void AC7(Surface surface) {
        C4573B5 A03 = A03();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A05[0] = "zEYrHw08cBp169ZitgaAlaUGutwvX";
            if (hasNext) {
                it.next().onRenderedFirstFrame(A03, surface);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4552Ak
    public final void ACH() {
        if (this.A02.A0F()) {
            this.A02.A08();
            C4573B5 A02 = A02();
            Iterator<InterfaceC4574B6> it = this.A04.iterator();
            while (it.hasNext()) {
                InterfaceC4574B6 listener = it.next();
                listener.onSeekProcessed(A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4552Ak
    public final void ACW(AbstractC4569B1 abstractC4569B1, @Nullable Object obj, int i) {
        this.A02.A0E(abstractC4569B1);
        C4573B5 A02 = A02();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onTimelineChanged(A02, i);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4552Ak
    public final void ACY(TrackGroupArray trackGroupArray, C4942HR c4942hr) {
        C4573B5 A02 = A02();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onTracksChanged(A02, trackGroupArray, c4942hr);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5060JN
    public final void ACg(String str, long j, long j2) {
        C4573B5 eventTime = A03();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(eventTime, 2, str, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5060JN
    public final void ACh(C4626Bw c4626Bw) {
        C4573B5 A00 = A00();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(A00, 2, c4626Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5060JN
    public final void ACi(C4626Bw c4626Bw) {
        C4573B5 A02 = A02();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(A02, 2, c4626Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5060JN
    public final void ACl(Format format) {
        C4573B5 A03 = A03();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(A03, 2, format);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5060JN
    public final void ACq(int i, int i2, int i3, float f) {
        C4573B5 A03 = A03();
        Iterator<InterfaceC4574B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(A03, i, i2, i3, f);
        }
    }
}
