package kotlinx.coroutines;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.RequiresOptIn;
import kotlin.annotation.EnumC10736a;
import kotlin.annotation.EnumC10737b;

@Target({ElementType.TYPE, ElementType.METHOD})
@Metadata(m509d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m508d2 = {"Lkotlinx/coroutines/InternalCoroutinesApi;", "", "kotlinx-coroutines-core"}, m507k = 1, m506mv = {1, 8, 0}, m504xi = 48)
@RequiresOptIn(level = RequiresOptIn.EnumC10734a.ERROR, message = "This is an internal kotlinx.coroutines API that should not be used from outside of kotlinx.coroutines. No compatibility guarantees are provided. It is recommended to report your use-case of internal API to kotlinx.coroutines issue tracker, so stable API could be provided instead")
@kotlin.annotation.Target(allowedTargets = {EnumC10737b.CLASS, EnumC10737b.FUNCTION, EnumC10737b.TYPEALIAS, EnumC10737b.PROPERTY})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(EnumC10736a.BINARY)
/* loaded from: classes3.dex */
public @interface InternalCoroutinesApi {
}