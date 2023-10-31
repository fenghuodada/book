package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Vg */
/* loaded from: assets/audience_network.dex */
public class C5814Vg extends DownloadAction.Deserializer {
    public C5814Vg(String str, int i) {
        super(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction.Deserializer
    /* renamed from: A00 */
    public final C5813Vf A01(int i, DataInputStream dataInputStream) throws IOException {
        Uri parse = Uri.parse(dataInputStream.readUTF());
        boolean readBoolean = dataInputStream.readBoolean();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        return new C5813Vf(parse, readBoolean, bArr, dataInputStream.readBoolean() ? dataInputStream.readUTF() : null);
    }
}
