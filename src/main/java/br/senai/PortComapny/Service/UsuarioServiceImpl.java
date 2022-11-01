package br.senai.PortComapny.Service;

import br.senai.PortComapny.Model.Usuario;
import br.senai.PortComapny.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Usuario create(Usuario usuario) {
        //usuario.setPassword(new BCryptPasswordEncoder().encode(usuario.getPassword()));
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario update(Long id, Usuario usuario) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public Optional<Usuario> read(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Usuario> findAll() {
        return null;
    }
}
