package xyz.meldlabs.dataway.communication.formats.send;

public class S_TransferRequest {
  public final String type = "TransferRequest";
  public String senderFriendCode;
  public String transferID;
  public String filename;
  public String message;
  public long filesize;
}