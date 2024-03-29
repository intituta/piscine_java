/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Message.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kferterb <kferterb@student.21-school.ru    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2022/07/25 20:44:35 by kferterb          #+#    #+#             */
/*   Updated: 2022/07/25 20:44:36 by kferterb         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package edu.school21.chat.models;

import java.sql.Timestamp;
import java.util.Objects;

public class Message {

    private Long id;
    private final User author;
    private final Chatroom room;
    private final String text;
    private final Timestamp dateTime;

    public Message(Long id, User author, Chatroom room, String text, Timestamp timestamp) {
        this.id = id;
        this.author = author;
        this.room = room;
        this.text = text;
        this.dateTime = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Message message = (Message) o;
        return Objects.equals(id, message.id) && Objects.equals(author, message.author) && Objects.equals(room, message.room) && Objects.equals(text, message.text) && Objects.equals(dateTime, message.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, room, text, dateTime);
    }

    @Override
    public String toString() {
        return "Message : {\n" +
                "id=" + id +
                ", \nauthor=" + author +
                ", \nroom=" + room +
                ", \ntext='" + text + '\'' +
                ", \ndateTime=" + dateTime + "\n" +
                '}';
    }

    public Long getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }

    public Chatroom getRoom() {
        return room;
    }

    public String getText() {
        return text;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
