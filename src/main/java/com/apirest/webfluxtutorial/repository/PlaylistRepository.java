package com.apirest.webfluxtutorial.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.apirest.webfluxtutorial.document.Playlist;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String> {

}
