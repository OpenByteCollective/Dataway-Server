package ob.dataway.utils.tcp.events.args;

import java.util.List;

import ob.dataway.utils.tcp.TcpConnection;
import ob.dataway.utils.tcp.events.OnSocketDisconnect;

public class OnSocketDisconnectArgs {
  /**
   * The exception that caused the disconnect.
   * null if the disconnect was not caused by an exception.
   */
  public final Exception exception;

  /**
   * The socket connection.
   */
  public final TcpConnection socket;

  private final List<OnSocketDisconnect> listeners;
  private final OnSocketDisconnect listener;

  public OnSocketDisconnectArgs(OnSocketDisconnect listener, List<OnSocketDisconnect> listeners, Exception exception, TcpConnection socket) {
    this.listeners = listeners;
    this.listener = listener;
    this.socket = socket;

    this.exception = exception;
  }

  /**
   * Unsubscribes the listener from the event.
   */
  public void unsubscribe() {
    if (listeners != null) {
      listeners.remove(listener);
    }
  }
}