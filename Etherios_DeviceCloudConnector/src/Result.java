//====================================================================================================//
import java.util.List;

import javax.xml.bind.annotation.*;
//====================================================================================================//
@XmlRootElement(name = "result")
public class Result 
{
private int                resultSize_;	
@XmlElement(name =        "resultSize")
public int getResultSize_() 
{
return resultSize_;
}
public void setResultSize_(int resultSize_) 
{
this.resultSize_ = resultSize_;
}
//---------------------------------------------------------------------------------------------------//
private int                requestedSize_;	
@XmlElement(name =        "requestedSize")
public int getRequestedSize_() 
{
return requestedSize_;
}
public void setRequestedSize_(int requestedSize_) 
{
this.requestedSize_ = requestedSize_;
}
//---------------------------------------------------------------------------------------------------//
private String             pageCursor_;
@XmlElement(name =        "pageCursor")
public String getPageCursor_() 
{
return pageCursor_;
}
public void setPageCursor_(String pageCursor_) 
{
this.pageCursor_ = pageCursor_;
}
//---------------------------------------------------------------------------------------------------//
private List<dataStream>   DataStream_;
@XmlElement(name =        "DataStream")
public List<dataStream> getDataStream_() 
{
return DataStream_;
}
public void setDataStream_(List<dataStream> dataStream_) 
{
DataStream_ = dataStream_;
}
}; // public class Result 
//====================================================================================================//
class  dataStream
{
private String      cstId_;
@XmlElement(name = "cstId")
public String getCstId_() 
{
return cstId_;
}
public void setCstId_(String cstId_) 
{
this.cstId_ = cstId_;
}
//---------------------------------------------------------------------------------------------------//
private String      streamId_;
@XmlElement(name = "streamId")
public String getStreamId_() 
{
return streamId_;
}
public void setStreamId_(String streamId_) 
{
this.streamId_ = streamId_;
}
//---------------------------------------------------------------------------------------------------//
private String      dataType_;
@XmlElement(name = "dataType")
public String getDataType_() 
{
return dataType_;
}
public void setDataType_(String dataType_) 
{
this.dataType_ = dataType_;
}
//---------------------------------------------------------------------------------------------------//
private String      forwardTo_;
@XmlElement(name = "forwardTo")
public String getForwardTo_() 
{
return forwardTo_;
}
public void setForwardTo_(String forwardTo_) 
{
this.forwardTo_ = forwardTo_;
}
//---------------------------------------------------------------------------------------------------//
private currentvalue currentValue_;
@XmlElement(name =  "currentValue")
public currentvalue getCurrentValue_() 
{
return currentValue_;
}
public void setCurrentValue_(currentvalue currentValue_) 
{
this.currentValue_ = currentValue_;
}
//---------------------------------------------------------------------------------------------------//
private String      description_;
@XmlElement(name = "description")
public String getDescription_() 
{
return description_;
}
public void setDescription_(String description_) 
{
this.description_ = description_;
}
//---------------------------------------------------------------------------------------------------//
private String      units_;
@XmlElement(name = "units")
public String getUnits_() 
{
return units_;
}
public void setUnits_(String units_) 
{
this.units_ = units_;
}
//---------------------------------------------------------------------------------------------------//
private String      dataTtl_;
@XmlElement(name = "dataTtl")
public String getDataTtl_() 
{
return dataTtl_;
}
public void setDataTtl_(String dataTtl_) 
{
this.dataTtl_ = dataTtl_;
}
//---------------------------------------------------------------------------------------------------//
private String      rollupTtl_;
@XmlElement(name = "rollupTtl")
public String getRollupTtl_() 
{
return rollupTtl_;
}
public void setRollupTtl_(String rollupTtl_) 
{
this.rollupTtl_ = rollupTtl_;
}
} // class dataStream
//====================================================================================================//
class  currentvalue
{
private  String     id_;
@XmlElement(name = "id")
public String getId_() 
{
return id_;
}
public void setId_(String id_) 
{
this.id_ = id_;
}
//---------------------------------------------------------------------------------------------------//
private  String     timestamp_;
@XmlElement(name = "timestamp")
public String getTimestamp_() 
{
return timestamp_;
}
public void setTimestamp_(String timestamp_) 
{
this.timestamp_ = timestamp_;
}
//---------------------------------------------------------------------------------------------------//
private  String     timestampISO_;
@XmlElement(name = "timestampISO")
public String getTimestampISO_() 
{
return timestampISO_;
}
public void setTimestampISO_(String timestampISO_) 
{
this.timestampISO_ = timestampISO_;
}
//---------------------------------------------------------------------------------------------------//
private  String     serverTimestamp_;
@XmlElement(name = "serverTimestamp")
public String getServerTimestamp_() 
{
return serverTimestamp_;
}
public void setServerTimestamp_(String serverTimestamp_) 
{
this.serverTimestamp_ = serverTimestamp_;
}
//---------------------------------------------------------------------------------------------------//
private  String     serverTimestampISO_;
@XmlElement(name = "serverTimestampISO")
public String getServerTimestampISO_() 
{
return serverTimestampISO_;
}
public void setServerTimestampISO_(String serverTimestampISO_) 
{
this.serverTimestampISO_ = serverTimestampISO_;
}
//---------------------------------------------------------------------------------------------------//
private  String     data_;
@XmlElement(name = "data")
public String getData_() 
{
return data_;
}
public void setData_(String data_) 
{
this.data_ = data_;
}
//---------------------------------------------------------------------------------------------------//
private  String     description_;
@XmlElement(name = "description")
public String getDescription_() 
{
return description_;
}
public void setDescription_(String description_) 
{
this.description_ = description_;
}
//---------------------------------------------------------------------------------------------------//
private  String     quality_;
@XmlElement(name = "quality")
public String getQuality_() 
{
return quality_;
}
public void setQuality_(String quality_) 
{
this.quality_ = quality_;
}
}; // class  currentvalue	
//====================================================================================================//