/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.cz.sara2.servirco;

import br.edu.ifpb.cz.sara2.entidade.Usuario;
import br.edu.ifpb.cz.sara2.repositorio.UsuarioRepositorio;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author jose
 */
@Named
@RequestScoped
public class UsuarioServico {
    @Inject
    private UsuarioRepositorio usuarioRepositorio;
    
    public boolean salvar(Usuario usuario){
        // Aqui validaria as regras de negócio
        return this.usuarioRepositorio.add(usuario);
    }
    public List<Usuario> buscar(){
        return this.usuarioRepositorio.index();
    }
    
}
