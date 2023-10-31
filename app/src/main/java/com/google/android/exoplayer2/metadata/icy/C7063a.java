package com.google.android.exoplayer2.metadata.icy;

import com.google.android.exoplayer2.metadata.AbstractC7062g;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.metadata.C7048d;
import com.google.common.base.C7929b;
import com.google.common.base.C7935d;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.metadata.icy.a */
/* loaded from: classes.dex */
public final class C7063a extends AbstractC7062g {

    /* renamed from: c */
    public static final Pattern f12525c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    public final CharsetDecoder f12526a = C7935d.f15693c.newDecoder();

    /* renamed from: b */
    public final CharsetDecoder f12527b = C7935d.f15692b.newDecoder();

    @Override // com.google.android.exoplayer2.metadata.AbstractC7062g
    /* renamed from: b */
    public final C7042a mo5507b(C7048d c7048d, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f12527b;
        CharsetDecoder charsetDecoder2 = this.f12526a;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new C7042a(new C7066c(bArr, null, null));
        }
        Matcher matcher = f12525c.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String m4294a = C7929b.m4294a(group);
                m4294a.getClass();
                if (!m4294a.equals("streamurl")) {
                    if (m4294a.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new C7042a(new C7066c(bArr, str2, str3));
    }
}
