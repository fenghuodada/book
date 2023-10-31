package libv2ray;

/* loaded from: classes3.dex */
public interface V2RayVPNServiceSupportsSet {
    long onEmitStatus(long j, String str);

    long prepare();

    boolean protect(long j);

    long setup(String str);

    long shutdown();
}
