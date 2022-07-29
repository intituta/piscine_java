/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   UsersRepository.java                               :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kferterb <kferterb@student.21-school.ru    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2022/07/29 09:46:09 by kferterb          #+#    #+#             */
/*   Updated: 2022/07/29 09:46:10 by kferterb         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package edu.school21.sockets.repositories;

import edu.school21.sockets.models.User;

import java.util.Optional;

public interface UsersRepository extends CrudRepository<User> {

    Optional<User> findByName(String name);
}
