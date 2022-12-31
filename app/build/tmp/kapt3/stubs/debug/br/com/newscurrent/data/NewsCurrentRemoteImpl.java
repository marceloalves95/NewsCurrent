package br.com.newscurrent.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lbr/com/newscurrent/data/NewsCurrentRemoteImpl;", "Lbr/com/newscurrent/domain/remote/NewsCurrentRemote;", "service", "Lbr/com/newscurrent/data/api/NewsApi;", "(Lbr/com/newscurrent/data/api/NewsApi;)V", "getNews", "Lbr/com/newscurrent/domain/models/News;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NewsCurrentRemoteImpl implements br.com.newscurrent.domain.remote.NewsCurrentRemote {
    private final br.com.newscurrent.data.api.NewsApi service = null;
    
    public NewsCurrentRemoteImpl(@org.jetbrains.annotations.NotNull()
    br.com.newscurrent.data.api.NewsApi service) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getNews(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super br.com.newscurrent.domain.models.News> continuation) {
        return null;
    }
}