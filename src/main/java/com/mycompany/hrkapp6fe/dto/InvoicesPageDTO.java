package com.mycompany.hrkapp6fe.dto;

import java.util.List;

public class InvoicesPageDTO {
	
	private List<InvoicesDTO> content;
	private PageableDTO pageable;
	private float totalPages;
	private float totalElements;
	private boolean last;
	private boolean first;
	private SortDTO sort;
	private float numberOfElements;
	private float size;
	private float number;
	private boolean empty;
	
	public InvoicesPageDTO() {
		super();
	}

	public InvoicesPageDTO(List<InvoicesDTO> content, PageableDTO pageable, float totalPages, float totalElements,
			boolean last, boolean first, SortDTO sort, float numberOfElements, float size, float number,
			boolean empty) {
		super();
		this.content = content;
		this.pageable = pageable;
		this.totalPages = totalPages;
		this.totalElements = totalElements;
		this.last = last;
		this.first = first;
		this.sort = sort;
		this.numberOfElements = numberOfElements;
		this.size = size;
		this.number = number;
		this.empty = empty;
	}

	public List<InvoicesDTO> getContent() {
		return content;
	}

	public void setContent(List<InvoicesDTO> content) {
		this.content = content;
	}

	public PageableDTO getPageable() {
		return pageable;
	}

	public void setPageable(PageableDTO pageable) {
		this.pageable = pageable;
	}

	public float getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(float totalPages) {
		this.totalPages = totalPages;
	}

	public float getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(float totalElements) {
		this.totalElements = totalElements;
	}

	public boolean isLast() {
		return last;
	}

	public void setLast(boolean last) {
		this.last = last;
	}

	public boolean isFirst() {
		return first;
	}

	public void setFirst(boolean first) {
		this.first = first;
	}

	public SortDTO getSort() {
		return sort;
	}

	public void setSort(SortDTO sort) {
		this.sort = sort;
	}

	public float getNumberOfElements() {
		return numberOfElements;
	}

	public void setNumberOfElements(float numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public float getNumber() {
		return number;
	}

	public void setNumber(float number) {
		this.number = number;
	}

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
}



