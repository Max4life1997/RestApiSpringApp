package com.example.springrestapiapp.restGetController;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageData {
    private long id;
    private String text;
}
