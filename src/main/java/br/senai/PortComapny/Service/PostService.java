package br.senai.PortComapny.Service;

import br.senai.PortComapny.Model.Post;
import br.senai.PortComapny.Model.Usuario;
import br.senai.PortComapny.Repository.PostRepository;

import java.util.List;
import java.util.Optional;

public interface PostService {

    public Post create(Post post);
    public Post update (Long id, Post post);
    public boolean delete(Long id);
    public Optional<Post> read(Long id);
    public List<Post> findAll();
}
