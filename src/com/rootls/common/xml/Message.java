package com.rootls.common.xml;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by luowei on 2014/9/10.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "message")
public class Message {

    //    @XmlMixed
    @XmlElementRef
    Head head;

    //    @XmlMixed
    @XmlElementRef
    Body body;

    public Message() {
    }

    public Message(Head head, Body body) {
        this.head = head;
        this.body = body;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public boolean isSuccessMessage() {
        boolean success = false;
        for (Field field : getHead().getFields()) {
            if (field.getName().equals("resp_code") && field.getValue().equals("000000000000")) {
                success = true;
            }
        }
        return success;
    }

    /**
     * Created by luowei on 2014/9/10.
     */
    @XmlRootElement(name = "head")
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Head {

        @XmlElement(name = "field")
        List<Field> fields = new ArrayList<Field>();

        public List<Field> getFields() {
            return fields;
        }

        public void setFields(List<Field> fields) {
            this.fields = fields;
        }

        @Override
        public String toString() {
            return "Head{" +
                    "fields=" + fields +
                    '}';
        }
    }

    /**
     * Created by luowei on 2014/9/10.
     */

    @XmlRootElement(name = "body")
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Body implements Serializable {

        @XmlElement(name = "field")
        List<Field> fields = new ArrayList<Field>();

        @XmlElement(name = "field-list")
        List<FieldList> fieldList = new ArrayList<FieldList>();

        public List<Field> getFields() {
            return fields;
        }

        public void setFields(List<Field> fields) {
            this.fields = fields;
        }

        public List<FieldList> getFieldList() {
            return fieldList;
        }

        public void setFieldList(List<FieldList> fieldList) {
            this.fieldList = fieldList;
        }

        @Override
        public String toString() {
            return "Body{" +
                    "fields=" + fields +
                    ", fieldList=" + fieldList +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Message{" +
                "head=" + head +
                ", body=" + body +
                '}';
    }

    public static Message getANewMessage() {
        Head head = new Head();
        Body body = new Body();

        return new Message(head, body);
    }

    @XmlRootElement(name = "field-list")
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class FieldList {

        @XmlElement(name = "field-list")
        List<SubFieldList> subFieldList = new ArrayList<SubFieldList>();

        public List<SubFieldList> getSubFieldList() {
            return subFieldList;
        }

        public void setSubFieldList(List<SubFieldList> subFieldList) {
            this.subFieldList = subFieldList;
        }

        @Override
        public String toString() {
            return "FieldList{" +
                    "subFieldList=" + subFieldList +
                    '}';
        }
    }

    @XmlRootElement(name = "field-list")
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class SubFieldList {

        @XmlElement(name = "field")
        List<Field> fieldList = new ArrayList<Field>();

        public List<Field> getFieldList() {
            return fieldList;
        }

        public void setFieldList(List<Field> fieldList) {
            this.fieldList = fieldList;
        }

        @Override
        public String toString() {
            return "SubFieldList{" +
                    "fieldList=" + fieldList +
                    '}';
        }
    }


    //---------------------

    /**
     * Created by luowei on 2014/9/10.
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Field {

        @XmlAttribute(name = "name")
        private String name;

        @XmlValue
        private String value;

        public Field() {
        }

        public Field(String name, String value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Field{" +
                    "name='" + name + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }


}
