package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.C10783b;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C11020i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nTasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,167:1\n314#2,11:168\n*S KotlinDebug\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n*L\n139#1:168,11\n*E\n"})
/* renamed from: kotlinx.coroutines.tasks.c */
/* loaded from: classes3.dex */
public final class C11142c {
    @Nullable
    /* renamed from: a */
    public static final Object m124a(@NotNull Task task, @NotNull AbstractC10786c abstractC10786c) {
        if (!task.isComplete()) {
            C11020i c11020i = new C11020i(1, C10783b.m455b(abstractC10786c));
            c11020i.m287s();
            task.addOnCompleteListener(ExecutorC11140a.f21801a, new C11141b(c11020i));
            return c11020i.m288q();
        }
        Exception exception = task.getException();
        if (exception == null) {
            if (task.isCanceled()) {
                throw new CancellationException("Task " + task + " was cancelled normally.");
            }
            return task.getResult();
        }
        throw exception;
    }
}
