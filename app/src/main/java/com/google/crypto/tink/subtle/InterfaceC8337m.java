package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: com.google.crypto.tink.subtle.m */
/* loaded from: classes3.dex */
public interface InterfaceC8337m<T> {

    /* renamed from: com.google.crypto.tink.subtle.m$a */
    /* loaded from: classes3.dex */
    public static class C8338a implements InterfaceC8337m<Cipher> {
        @Override // com.google.crypto.tink.subtle.InterfaceC8337m
        /* renamed from: a */
        public final Cipher mo3425a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
        }
    }

    /* renamed from: com.google.crypto.tink.subtle.m$b */
    /* loaded from: classes3.dex */
    public static class C8339b implements InterfaceC8337m<Mac> {
        @Override // com.google.crypto.tink.subtle.InterfaceC8337m
        /* renamed from: a */
        public final Mac mo3425a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    /* renamed from: a */
    T mo3425a(String str, Provider provider) throws GeneralSecurityException;
}
