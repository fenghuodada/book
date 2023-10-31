package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.metadata.id3.C7076e;
import com.google.android.exoplayer2.metadata.id3.C7084i;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.extractor.p */
/* loaded from: classes.dex */
public final class C6901p {

    /* renamed from: c */
    public static final Pattern f11610c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f11611a = -1;

    /* renamed from: b */
    public int f11612b = -1;

    /* renamed from: a */
    public final boolean m5851a(String str) {
        Matcher matcher = f11610c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i = C7408g0.f13905a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f11611a = parseInt;
                    this.f11612b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m5850b(C7042a c7042a) {
        int i = 0;
        while (true) {
            C7042a.InterfaceC7044b[] interfaceC7044bArr = c7042a.f12490a;
            if (i < interfaceC7044bArr.length) {
                C7042a.InterfaceC7044b interfaceC7044b = interfaceC7044bArr[i];
                if (interfaceC7044b instanceof C7076e) {
                    C7076e c7076e = (C7076e) interfaceC7044b;
                    if ("iTunSMPB".equals(c7076e.f12554c) && m5851a(c7076e.f12555d)) {
                        return;
                    }
                } else if (interfaceC7044b instanceof C7084i) {
                    C7084i c7084i = (C7084i) interfaceC7044b;
                    if ("com.apple.iTunes".equals(c7084i.f12566b) && "iTunSMPB".equals(c7084i.f12567c) && m5851a(c7084i.f12568d)) {
                        return;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                return;
            }
        }
    }
}
