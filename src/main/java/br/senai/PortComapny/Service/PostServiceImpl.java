package br.senai.PortComapny.Service;

import br.senai.PortComapny.Model.Post;
import br.senai.PortComapny.Model.Usuario;
import br.senai.PortComapny.Repository.PostRepository;
import br.senai.PortComapny.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepository postRepository;

    @Override
    public Post create(Post post) {
        //usuario.setPassword(new BCryptPasswordEncoder().encode(post.getPassword()));
        return postRepository.save(Post);
    }

    @Override
    public Post update(Long id, Post post) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public Optional<Post> read(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Post> findAll() {
        return null;
    }
}
