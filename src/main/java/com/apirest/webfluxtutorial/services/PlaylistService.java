package com.apirest.webfluxtutorial.services;

import com.apirest.webfluxtutorial.document.Playlist;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PlaylistService {

	Flux<Playlist> findAll();
	Mono<Playlist> findByID(String id);
	Mono<Playlist> save(Playlist playlist);
}
