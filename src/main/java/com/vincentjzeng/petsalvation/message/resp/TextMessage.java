package com.vincentjzeng.petsalvation.message.resp;

public class TextMessage extends ResponseMessage {
	 // 回复的消息内容  
    private String Content;  
  
    public String getContent() {  
        return Content;  
    }  
  
    public void setContent(String content) {  
        Content = content;  
    }  
}
