package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.log.C9549a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.device.reader.b */
/* loaded from: classes3.dex */
public class C9518b implements InterfaceC9531n {

    /* renamed from: a */
    private final InterfaceC9533p f18845a;

    public C9518b(InterfaceC9533p interfaceC9533p) {
        this.f18845a = interfaceC9533p;
    }

    @Override // com.unity3d.services.core.device.reader.InterfaceC9532o
    /* renamed from: a */
    public Map<String, Object> mo2056a() {
        return this.f18845a.mo2037a();
    }

    @Override // com.unity3d.services.core.device.reader.InterfaceC9531n
    /* renamed from: a */
    public byte[] mo2057a(Map<String, Object> map) {
        String str;
        if (map != null) {
            String jSONObject = new JSONObject(map).toString();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(jSONObject.length());
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(jSONObject.getBytes());
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                str = "Error occurred while trying to compress device data.";
            }
        } else {
            str = "Invalid DeviceInfoData: Expected non null map provided by reader";
        }
        C9549a.m2017c(str);
        return null;
    }

    /* renamed from: b */
    public byte[] m2070b() {
        return mo2057a(mo2056a());
    }
}
