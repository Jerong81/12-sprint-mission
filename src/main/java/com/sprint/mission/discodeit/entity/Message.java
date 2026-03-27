package com.sprint.mission.discodeit.entity;

import java.util.UUID;

public class Message {
    private final UUID id;
    private UUID userId;
    private UUID channelID;
    private String content;
    private final Long createdAt;
    private Long updatedAt;

    public Message(UUID userId, UUID channelID, String content) {
        this.id = UUID.randomUUID();
        this.userId = userId;
        this.channelID = channelID;
        this.content = content;
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = System.currentTimeMillis();
    }

    public UUID getId() {
        return id;
    }

    public UUID getUserId() {
        return userId;
    }

    public UUID getChannelId() {
        return channelID;
    }

    public String getContent() {
        return content;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void update(String content) {
        this.content = content;
        this.updatedAt = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", userId=" + userId +
                ", channelID=" + channelID +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
