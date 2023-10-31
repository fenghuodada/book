package libv2ray;

import java.util.Arrays;
import p059go.Seq;

/* loaded from: classes3.dex */
public final class V2RayPoint implements Seq.Proxy {
    private final int refnum;

    static {
        Libv2ray.touch();
    }

    public V2RayPoint(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    public V2RayPoint(V2RayVPNServiceSupportsSet v2RayVPNServiceSupportsSet, boolean z) {
        int __NewV2RayPoint = __NewV2RayPoint(v2RayVPNServiceSupportsSet, z);
        this.refnum = __NewV2RayPoint;
        Seq.trackGoRef(__NewV2RayPoint, this);
    }

    private static native int __NewV2RayPoint(V2RayVPNServiceSupportsSet v2RayVPNServiceSupportsSet, boolean z);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof V2RayPoint)) {
            return false;
        }
        V2RayPoint v2RayPoint = (V2RayPoint) obj;
        V2RayVPNServiceSupportsSet supportSet = getSupportSet();
        V2RayVPNServiceSupportsSet supportSet2 = v2RayPoint.getSupportSet();
        if (supportSet == null) {
            if (supportSet2 != null) {
                return false;
            }
        } else if (!supportSet.equals(supportSet2)) {
            return false;
        }
        if (getIsRunning() != v2RayPoint.getIsRunning()) {
            return false;
        }
        String domainName = getDomainName();
        String domainName2 = v2RayPoint.getDomainName();
        if (domainName == null) {
            if (domainName2 != null) {
                return false;
            }
        } else if (!domainName.equals(domainName2)) {
            return false;
        }
        String configureFileContent = getConfigureFileContent();
        String configureFileContent2 = v2RayPoint.getConfigureFileContent();
        if (configureFileContent == null) {
            if (configureFileContent2 != null) {
                return false;
            }
        } else if (!configureFileContent.equals(configureFileContent2)) {
            return false;
        }
        return getAsyncResolve() == v2RayPoint.getAsyncResolve();
    }

    public final native boolean getAsyncResolve();

    public final native String getConfigureFileContent();

    public final native String getDomainName();

    public final native boolean getIsRunning();

    public final native V2RayVPNServiceSupportsSet getSupportSet();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getSupportSet(), Boolean.valueOf(getIsRunning()), getDomainName(), getConfigureFileContent(), Boolean.valueOf(getAsyncResolve())});
    }

    @Override // p059go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native long measureDelay() throws Exception;

    public native long queryStats(String str, String str2);

    public native void runLoop(boolean z) throws Exception;

    public final native void setAsyncResolve(boolean z);

    public final native void setConfigureFileContent(String str);

    public final native void setDomainName(String str);

    public final native void setIsRunning(boolean z);

    public final native void setSupportSet(V2RayVPNServiceSupportsSet v2RayVPNServiceSupportsSet);

    public native void stopLoop() throws Exception;

    public String toString() {
        return "V2RayPoint{SupportSet:" + getSupportSet() + ",IsRunning:" + getIsRunning() + ",DomainName:" + getDomainName() + ",ConfigureFileContent:" + getConfigureFileContent() + ",AsyncResolve:" + getAsyncResolve() + ",}";
    }
}
