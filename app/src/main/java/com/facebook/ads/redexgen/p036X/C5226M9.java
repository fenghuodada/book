package com.facebook.ads.redexgen.p036X;

import java.io.IOException;
import java.io.Writer;

/* renamed from: com.facebook.ads.redexgen.X.M9 */
/* loaded from: assets/audience_network.dex */
public class C5226M9 extends Writer {
    public static String[] A03 = {"m3VYVt1tyYlWEg8H2HS3pUr0VsrhpbIN", "rEdvzR", "IUQqTrakmjCy7RtoUebGZ8YLkwuKbv7t", "x1ufNW", "e7NtJ1", "AK7iWzpXctzvcUrQA38QQTSmPkrm2HP", "25DCnOqD1cr08G9nl6wTfczykol7NaSA", "0bM1VBntYb2o4FFsMu8yzxmwObMsLmHM"};
    public int A00;
    public char[] A01 = new char[1024];
    public final InterfaceC5225M8 A02;

    public C5226M9(InterfaceC5225M8 interfaceC5225M8) {
        this.A02 = interfaceC5225M8;
    }

    private void A00() {
        this.A02.ADK(new String(this.A01, 0, this.A00));
        this.A00 = 0;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        flush();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        if (this.A00 > 0) {
            A00();
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        int i3 = i;
        while (true) {
            int i4 = i + i2;
            String[] strArr = A03;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A03[5] = "5m1TKypG4e5yu";
            if (i3 < i4) {
                if (cArr[i3] != '\n') {
                    int i5 = this.A00;
                    char[] cArr2 = this.A01;
                    if (i5 != cArr2.length) {
                        cArr2[i5] = cArr[i3];
                        this.A00 = i5 + 1;
                        i3++;
                    }
                }
                A00();
                i3++;
            } else {
                return;
            }
        }
    }
}
