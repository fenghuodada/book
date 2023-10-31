package com.facebook.ads.internal.checkerframework.checker.nullness.qual;

import com.facebook.ads.internal.checkerframework.framework.qual.DefaultFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultInUncheckedCodeFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import com.facebook.ads.internal.checkerframework.framework.qual.QualifierForLiterals;
import com.facebook.ads.internal.checkerframework.framework.qual.SubtypeOf;
import com.facebook.ads.internal.checkerframework.framework.qual.UpperBoundFor;
import com.facebook.ads.redexgen.p036X.EnumC43998A;
import com.facebook.ads.redexgen.p036X.EnumC44098O;
import com.facebook.ads.redexgen.p036X.EnumC44108P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SubtypeOf({MonotonicNonNull.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@UpperBoundFor(typeKinds = {EnumC44098O.A0I, EnumC44098O.A0C, EnumC44098O.A04, EnumC44098O.A06, EnumC44098O.A08, EnumC44098O.A0B, EnumC44098O.A0E, EnumC44098O.A0J, EnumC44098O.A05})
@Retention(RetentionPolicy.RUNTIME)
@QualifierForLiterals({EnumC43998A.A0B})
@DefaultFor({EnumC44108P.A05})
@DefaultQualifierInHierarchy
@DefaultInUncheckedCodeFor({EnumC44108P.A0E, EnumC44108P.A0C})
@Documented
/* loaded from: assets/audience_network.dex */
public @interface NonNull {
}
