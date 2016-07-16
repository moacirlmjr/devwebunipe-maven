package br.com.unipe.gerenciamentoAdvogados.model.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import br.com.unipe.gerenciamentoAdvogados.model.dao.UsuarioDAO;
import br.com.unipe.gerenciamentoAdvogados.model.vo.Usuario;

@Component
public class SpringUtil {

	@Autowired
	private UsuarioDAO usuarioDao;

	public SpringUtil() {

	}

	public Usuario getSessionUser() {
		Usuario usuario = new Usuario();
		try {
			usuario = usuarioDao.findByUsername(this.getSessionUserName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return usuario;
	}

	public String getSessionUserName() {
		SecurityContext context = SecurityContextHolder.getContext();
		if (context instanceof SecurityContext) {
			Authentication authentication = context.getAuthentication();
			if (authentication instanceof Authentication) {
				if (authentication.getPrincipal() instanceof User) {
					return ((User) authentication.getPrincipal()).getUsername();
				} else {
					return (String) authentication.getPrincipal();
				}
			}
		}

		return null;
	}
}
