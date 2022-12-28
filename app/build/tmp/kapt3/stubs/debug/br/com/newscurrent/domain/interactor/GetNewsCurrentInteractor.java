package br.com.newscurrent.domain.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lbr/com/newscurrent/domain/interactor/GetNewsCurrentInteractor;", "", "remote", "Lbr/com/newscurrent/domain/remote/NewsCurrentRemote;", "(Lbr/com/newscurrent/domain/remote/NewsCurrentRemote;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lbr/com/newscurrent/network/event/Event;", "Lbr/com/newscurrent/domain/models/News;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetNewsCurrentInteractor {
    private final br.com.newscurrent.domain.remote.NewsCurrentRemote remote = null;
    
    public GetNewsCurrentInteractor(@org.jetbrains.annotations.NotNull
    br.com.newscurrent.domain.remote.NewsCurrentRemote remote) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends br.com.newscurrent.network.event.Event<br.com.newscurrent.domain.models.News>>> continuation) {
        return null;
    }
}