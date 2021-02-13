/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.cz.sara2.controle;

import br.edu.ifpb.cz.sara2.entidade.Usuario;
import br.edu.ifpb.cz.sara2.servirco.UsuarioServico;
import br.edu.ifpb.cz.sara2.util.Mensagem;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author jose
 */
@RequestScoped
@Named
public class UsuarioControle {
    @Inject
    private Mensagem message;
    @Inject
    private UsuarioServico usuarioServico;
    
    private Usuario usuario;

    public UsuarioControle() {
        this.usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String salvar(){
       
        if(usuarioServico.salvar(usuario))
            message.addMessage("Usuário Cadastrado com sucesso");
        return "home";
    }
    
}
