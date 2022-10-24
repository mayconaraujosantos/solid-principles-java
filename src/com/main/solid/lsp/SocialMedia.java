package com.main.solid.lsp;

public abstract class SocialMedia {

  public abstract void chatWithFriend();

  public abstract void publishPost(Object post);

  public abstract void sendPhotosAndVideos();

  public abstract void groupVideoCall(String... users);

  @Override
  public String toString() {
    return super.toString();
  }
}
