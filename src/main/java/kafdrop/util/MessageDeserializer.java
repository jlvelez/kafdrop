package kafdrop.util;

import java.nio.*;

public interface MessageDeserializer {
  String deserializeMessage(ByteBuffer buffer);
  String getSchema();
}
