package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.F7 */
/* loaded from: assets/audience_network.dex */
public class C4802F7 extends C6195bs {
    public static String[] A00 = {"ebBTtcDfrXbt7XUNv2xXXzukgR", "AfSrg72OINfokWlk8lEehE43rER54C5K", "DLWRAT6zkYb5ZQ4lVerhsjeXnJdmq546", "HcA6UXt4lgXnqoCqWVxSHZRcl", "xLJGdEWbtHtgosfXVcR1IwW", "KlZdBiYd7CYsgOQcQxjIKqODuE8wujbn", "gwTEk6Fa0GjLNEZ2sqovA8E7SRT86ppt", "mobLesdsIst7Z6gfBQK3QOgi9WAmLStS"};

    public C4802F7(C422159 c422159) {
        super(c422159);
    }

    @Override // com.facebook.ads.redexgen.p036X.C6195bs, com.facebook.ads.redexgen.p036X.InterfaceC5269Mq
    public final void A3s(String rewardedVideoError) {
        if (this.A00.get() == null) {
            return;
        }
        C422159 c422159 = this.A00.get();
        if (A00[1].charAt(12) != 'k') {
            throw new RuntimeException();
        }
        A00[0] = "wcnlDkVPCotGmNFV8gEH10X6";
        c422159.A0D(rewardedVideoError);
        String A02 = EnumC5472Q9.A08.A02();
        String A022 = EnumC5472Q9.A09.A02();
        if (rewardedVideoError.equals(A02)) {
            this.A00.get().finish(11);
        } else if (rewardedVideoError.equals(A022)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.C6195bs, com.facebook.ads.redexgen.p036X.InterfaceC5269Mq
    public final void A3t(String str, C44819a c44819a) {
        super.A3t(str, c44819a);
    }
}
