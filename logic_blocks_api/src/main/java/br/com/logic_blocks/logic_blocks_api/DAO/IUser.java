package br.com.logic_blocks.logic_blocks_api.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.logic_blocks.logic_blocks_api.models.User;

public interface IUser extends CrudRepository<User, Integer>{

}
