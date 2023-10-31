package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.EnumC3446c;

/* renamed from: com.bumptech.glide.load.engine.m */
/* loaded from: classes.dex */
public abstract class AbstractC3543m {

    /* renamed from: a */
    public static final C3545b f9400a;

    /* renamed from: b */
    public static final C3546c f9401b;

    /* renamed from: c */
    public static final C3548e f9402c;

    /* renamed from: com.bumptech.glide.load.engine.m$a */
    /* loaded from: classes.dex */
    public class C3544a extends AbstractC3543m {
        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: a */
        public final boolean mo6643a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: b */
        public final boolean mo6642b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: c */
        public final boolean mo6641c(EnumC3444a enumC3444a) {
            return enumC3444a == EnumC3444a.REMOTE;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: d */
        public final boolean mo6640d(boolean z, EnumC3444a enumC3444a, EnumC3446c enumC3446c) {
            return (enumC3444a == EnumC3444a.RESOURCE_DISK_CACHE || enumC3444a == EnumC3444a.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.m$b */
    /* loaded from: classes.dex */
    public class C3545b extends AbstractC3543m {
        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: a */
        public final boolean mo6643a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: b */
        public final boolean mo6642b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: c */
        public final boolean mo6641c(EnumC3444a enumC3444a) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: d */
        public final boolean mo6640d(boolean z, EnumC3444a enumC3444a, EnumC3446c enumC3446c) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.m$c */
    /* loaded from: classes.dex */
    public class C3546c extends AbstractC3543m {
        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: a */
        public final boolean mo6643a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: b */
        public final boolean mo6642b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: c */
        public final boolean mo6641c(EnumC3444a enumC3444a) {
            return (enumC3444a == EnumC3444a.DATA_DISK_CACHE || enumC3444a == EnumC3444a.MEMORY_CACHE) ? false : true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: d */
        public final boolean mo6640d(boolean z, EnumC3444a enumC3444a, EnumC3446c enumC3446c) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.m$d */
    /* loaded from: classes.dex */
    public class C3547d extends AbstractC3543m {
        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: a */
        public final boolean mo6643a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: b */
        public final boolean mo6642b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: c */
        public final boolean mo6641c(EnumC3444a enumC3444a) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: d */
        public final boolean mo6640d(boolean z, EnumC3444a enumC3444a, EnumC3446c enumC3446c) {
            return (enumC3444a == EnumC3444a.RESOURCE_DISK_CACHE || enumC3444a == EnumC3444a.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.m$e */
    /* loaded from: classes.dex */
    public class C3548e extends AbstractC3543m {
        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: a */
        public final boolean mo6643a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: b */
        public final boolean mo6642b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: c */
        public final boolean mo6641c(EnumC3444a enumC3444a) {
            return enumC3444a == EnumC3444a.REMOTE;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC3543m
        /* renamed from: d */
        public final boolean mo6640d(boolean z, EnumC3444a enumC3444a, EnumC3446c enumC3446c) {
            return ((z && enumC3444a == EnumC3444a.DATA_DISK_CACHE) || enumC3444a == EnumC3444a.LOCAL) && enumC3446c == EnumC3446c.TRANSFORMED;
        }
    }

    static {
        new C3544a();
        f9400a = new C3545b();
        f9401b = new C3546c();
        new C3547d();
        f9402c = new C3548e();
    }

    /* renamed from: a */
    public abstract boolean mo6643a();

    /* renamed from: b */
    public abstract boolean mo6642b();

    /* renamed from: c */
    public abstract boolean mo6641c(EnumC3444a enumC3444a);

    /* renamed from: d */
    public abstract boolean mo6640d(boolean z, EnumC3444a enumC3444a, EnumC3446c enumC3446c);
}
